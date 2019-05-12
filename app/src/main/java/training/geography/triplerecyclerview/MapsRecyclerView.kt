package training.geography.triplerecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MapAdapter(val mapcountrylist: List<MapCard>):
    RecyclerView.Adapter<MapAdapter.MapViewHolder> () {
    class MapViewHolder (mapView: View) : RecyclerView.ViewHolder (mapView){
        val mapcountry = mapView.findViewById<ImageView>(R.id.mapcountry)
        val mapname = mapView.findViewById<TextView>(R.id.mapname)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MapViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val viewItem = inflater.inflate(R.layout.item_map, parent, false)
        return MapViewHolder(viewItem)
    }

    override fun onBindViewHolder(holder: MapViewHolder, position: Int) {
        var mapcountryList =  mapcountrylist.map{it.mapnorth}
        var mapcountry = mapcountryList[position]
        holder.mapname.text = mapcountry

        when (position){
          0 -> holder.mapcountry.setImageResource(R.drawable.armbolgbrago)
           1 -> holder.mapcountry.setImageResource(R.drawable.azebraautben)
           2 -> holder.mapcountry.setImageResource(R.drawable.bfablrcolbgd)
           3 -> holder.mapcountry.setImageResource(R.drawable.bwabelbhrchl)
           4 -> holder.mapcountry.setImageResource(R.drawable.cafafgalbarg)
           5 -> holder.mapcountry.setImageResource(R.drawable.chetkmtursur)
           6 -> holder.mapcountry.setImageResource(R.drawable.cricmrbtnbih)
           7 -> holder.mapcountry.setImageResource(R.drawable.saublzdeudza)
           8 -> holder.mapcountry.setImageResource(R.drawable.svnthatcdpry)
           9 -> holder.mapcountry.setImageResource(R.drawable.swetlstgoper)
           10 -> holder.mapcountry.setImageResource(R.drawable.tjkpansvktza)
           11 -> holder.mapcountry.setImageResource(R.drawable.venzwlyemukr)
           12 -> holder.mapcountry.setImageResource(R.drawable.zmbtururyvnm)
        }

    }
    override fun getItemCount(): Int {
        return mapcountrylist.size
    }
}

