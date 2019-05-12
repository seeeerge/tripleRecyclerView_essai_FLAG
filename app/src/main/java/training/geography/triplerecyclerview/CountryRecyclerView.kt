package training.geography.triplerecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CountryAdapter(val countrylist: List<CountryCard>): RecyclerView.Adapter<CountryAdapter.ViewHolder> () {
    class ViewHolder (itemView: View) : RecyclerView.ViewHolder (itemView){
        val icon = itemView.findViewById<ImageView>(R.id.icon)
        val name = itemView.findViewById<TextView>(R.id.name)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val viewItem = inflater.inflate(R.layout.item_country, parent, false)
        return ViewHolder(viewItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //val country = countrylist[position]
        var countryList = countrylist.map{it.countrytrigram}
        var country = countryList[position]
        holder.name.text = country

        when (position){
            0 -> holder.icon.setImageResource(R.drawable.afg)
            1 -> holder.icon.setImageResource(R.drawable.ago)
            2 -> holder.icon.setImageResource(R.drawable.alb)
            3 -> holder.icon.setImageResource(R.drawable.arg)
            4 -> holder.icon.setImageResource(R.drawable.arm)
            5 -> holder.icon.setImageResource(R.drawable.aut)
            6 -> holder.icon.setImageResource(R.drawable.aze)
            7 -> holder.icon.setImageResource(R.drawable.bel)
            8 -> holder.icon.setImageResource(R.drawable.bfa)
            9 -> holder.icon.setImageResource(R.drawable.bhr)
            10 -> holder.icon.setImageResource(R.drawable.bih)
            11 -> holder.icon.setImageResource(R.drawable.blr)
            12 -> holder.icon.setImageResource(R.drawable.blz)
            13 -> holder.icon.setImageResource(R.drawable.bol)
            14 -> holder.icon.setImageResource(R.drawable.bra)
        }
    }
    override fun getItemCount(): Int {
        return countrylist.size
    }
}

