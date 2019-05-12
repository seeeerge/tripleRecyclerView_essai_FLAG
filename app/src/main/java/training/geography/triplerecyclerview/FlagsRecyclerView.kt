package training.geography.triplerecyclerview

import android.provider.Settings.Global.getString
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class FlagAdapter(val flagcountrylist: List<FlagCard>,
                  val flagitemClickListener : View.OnClickListener
                  //val flagitemOnLongClickListener : View.OnLongClickListener
    ):
    RecyclerView.Adapter<FlagAdapter.FlagViewHolder> () {
    class FlagViewHolder(flagView: View) : RecyclerView.ViewHolder(flagView) {
        val flagcardView = flagView.findViewById<CardView>(R.id.flag_card_view)
        val flagcountry = flagView.findViewById<ImageView>(R.id.flagcountry)
        val flagname = flagView.findViewById<TextView>(R.id.flagname)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlagViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val viewItem = inflater.inflate(R.layout.item_flag, parent, false)
        return FlagViewHolder(viewItem)
    }

    override fun onBindViewHolder(flagholder: FlagViewHolder, position: Int) {
        //val flagcountry: String = flagcountrylist.FlagCard.flagimage[position]
        //var flagimageList: List<String> = flagcountrylist.map { it.flagimage }
        var flagsouthList: List<String> = flagcountrylist.map { it.flagsouth }
        var iflagsouth = flagsouthList[position]
        flagholder.flagname.text = iflagsouth
        flagholder.flagcardView.tag = position
        flagholder.flagcardView.setOnClickListener(flagitemClickListener)
        //flagholder.flagcardView.setOnLongClickListener(itemOnLongClickListener)

        when (position){
            0 -> flagholder.flagcountry.setImageResource(R.drawable.afgcol)
            1 -> flagholder.flagcountry.setImageResource(R.drawable.argsvk)
            2 -> flagholder.flagcountry.setImageResource(R.drawable.armche)
            3 -> flagholder.flagcountry.setImageResource(R.drawable.auttgo)
            4 -> flagholder.flagcountry.setImageResource(R.drawable.azepry)
            5 -> flagholder.flagcountry.setImageResource(R.drawable.bhrtur)
            6 -> flagholder.flagcountry.setImageResource(R.drawable.bratls)
            7 -> flagholder.flagcountry.setImageResource(R.drawable.bwasur)
            8 -> flagholder.flagcountry.setImageResource(R.drawable.cafbtn)
            9 -> flagholder.flagcountry.setImageResource(R.drawable.critun)
            10 -> flagholder.flagcountry.setImageResource(R.drawable.pandza)
            11 -> flagholder.flagcountry.setImageResource(R.drawable.persau)
            12 -> flagholder.flagcountry.setImageResource(R.drawable.svnago)
            13 -> flagholder.flagcountry.setImageResource(R.drawable.sweben)
            14 -> flagholder.flagcountry.setImageResource(R.drawable.tcdgbr)
            15 -> flagholder.flagcountry.setImageResource(R.drawable.thabol)
            16 -> flagholder.flagcountry.setImageResource(R.drawable.tjkdeu)
            17 -> flagholder.flagcountry.setImageResource(R.drawable.tkmbel)
            18 -> flagholder.flagcountry.setImageResource(R.drawable.tzablz)
            19 -> flagholder.flagcountry.setImageResource(R.drawable.ukrcmr)
            20 -> flagholder.flagcountry.setImageResource(R.drawable.uryblr)
            21 -> flagholder.flagcountry.setImageResource(R.drawable.venbgd)
            22 -> flagholder.flagcountry.setImageResource(R.drawable.vnmbfa)
            23 -> flagholder.flagcountry.setImageResource(R.drawable.yembih)
            24 -> flagholder.flagcountry.setImageResource(R.drawable.zmbchl)
            25 -> flagholder.flagcountry.setImageResource(R.drawable.zwealb)
        }
        //var iflagcard:String  = imagelist[position]
     //holder.flagcountry.setImageResource(iflagcard)
    }

    override fun getItemCount(): Int {
            return flagcountrylist.size
        }
    }

