package training.geography.triplerecyclerview

import android.nfc.Tag
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.view.animation.Animation
import android.view.animation.RotateAnimation
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_flag.*

data class FlagCard(var flagtrigramup: String, var flagtrigramdown: String,
                        var flagimage: String, var flagsouth: String, var rotationpossible: Boolean=(true))

data class CountryCard(val countrytrigram: String, val description: String)

data class MapCard(var map_left_up: String,
                   var map_right_up: String,
                   var map_left_down: String,
                   var map_right_down: String,
                   var maps_img: String,
                   var mapnorth: String)


class MainActivity : AppCompatActivity(), OnClickListener {


    var afg_col = FlagCard("col", "afg", "afgcol", "afg", true)
    var arg_svk = FlagCard("arg", "svk", "argsvk", "svk", true)
    var arm_che = FlagCard("che", "arm", "armche", "arm", true)
    var aut_tgo = FlagCard("tgo", "aut", "auttgo", "aut", true)
    var aze_pry = FlagCard("aze", "pry", "azepry", "pry", true)
    var bhr_tur = FlagCard("tur", "bhr", "bhrtur", "bhr", true)
    var bra_tls = FlagCard("tls", "bra", "bratls", "bra", true)
    var bwa_sur = FlagCard("sur", "bwa", "bwasur", "bwa", true)
    var caf_btn = FlagCard("btn", "caf", "cafbtn", "caf", true)
    var cri_tun = FlagCard("cri", "tun", "critun", "tun", true)
    var pan_dza = FlagCard("pan", "dza", "pandza", "dza", true)
    var per_sau = FlagCard("per", "sau", "persau", "sau", true)
    var svn_ago = FlagCard("svn", "ago", "svnago", "ago", true)
    var swe_ben = FlagCard("swe", "ben", "sweben", "ben", true)
    var tcd_gbr = FlagCard("tcd", "gbr", "tcdgbr", "gbr", true)
    var tha_bol = FlagCard("tha", "bol", "thabol", "bol", true)
    var tjk_deu = FlagCard("tjk", "deu", "tjkdeu", "deu", true)
    var tkm_bel = FlagCard("tkm", "bel", "tkmbel", "bel", true)
    var tza_blz = FlagCard("tza", "blz", "tzablz", "blz", true)
    var ukr_cmr = FlagCard("ukr", "cmr", "ukrcmr", "cmr", true)
    var ury_blr = FlagCard("ury", "blr", "uryblr", "blr", true)
    var ven_bgd = FlagCard("ven", "bgd", "venbgd", "bgd", true)
    var vnm_bfa = FlagCard("vnm", "bfa", "vnmbfa", "bfa", true)
    var yem_bih = FlagCard("yem", "bih", "yembih", "bih", true)
    var zmb_chl = FlagCard("zmb", "chl", "zmbchl", "chl", true)
    var zwe_alb = FlagCard("zwe", "alb", "zwealb", "alb", true)

    var afg = CountryCard("afg", "afg")
    var ago = CountryCard("ago", "ago")
    var alb = CountryCard("alb", "alb")
    var arg = CountryCard("arg", "arg")
    var arm = CountryCard("arm", "arm")
    var aut = CountryCard("aut", "aut")
    var aze = CountryCard("aze", "aze")
    var bel = CountryCard("bel", "bel")
    var bfa = CountryCard("bfa", "bfa")
    var bhr = CountryCard("bhr", "bhr")
    var bih = CountryCard("bih", "bih")
    var blz = CountryCard("blz", "blz")
    var bol = CountryCard("bol", "bol")
    var bra = CountryCard("bra", "bra")
    var btn = CountryCard("btn", "btn")
    var bwa = CountryCard("bwa", "bwa")
    var caf = CountryCard("caf", "caf")
    var che = CountryCard("che", "che")
    var chl = CountryCard("chl", "chl")
    var cmr = CountryCard("cmr", "cmr")
    var col = CountryCard("col", "col")
    var cri = CountryCard("cri", "cri")
    var deu = CountryCard("deu", "deu")
    var gbr = CountryCard("gbr", "gbr")
    var pan = CountryCard("pan", "pan")
    var per = CountryCard("per", "per")
    var pry = CountryCard("pry", "pry")
    var sau = CountryCard("sau", "sau")
    var sur = CountryCard("sur", "sur")
    var svk = CountryCard("svk", "svk")
    var svn = CountryCard("svn", "svn")
    var swe = CountryCard("swe", "swe")
    var tcd = CountryCard("tcd", "tcd")
    var tgo = CountryCard("tgo", "tgo")
    var tha = CountryCard("tha", "tha")
    var tjk = CountryCard("tjk", "tjk")
    var tkm = CountryCard("tkm", "tkm")
    var tls = CountryCard("tls", "tls")
    var tun = CountryCard("tun", "tun")
    var tur = CountryCard("tur", "tur")
    var tza = CountryCard("tza", "tza")
    var ukr = CountryCard("ukr", "ukr")
    var ury = CountryCard("ury", "ury")
    var ven = CountryCard("ven", "ven")
    var vnm = CountryCard("vnm", "vnm")
    var yem = CountryCard("yem", "yem")
    var zmb = CountryCard("zmb", "zmb")
    var zwe = CountryCard("zwe", "zwe")

    var arm_bol_gbr_ago = MapCard("arm", "bol", "gbr", "ago", "bol", "armbolgbrago")
    var aze_bra_aut_ben = MapCard("aze", "bra", "aut", "ben", "bra", "azebraautben")
    var bfa_blr_col_bgd = MapCard("bfa", "blr", "col", "bgd", "blr", "bfablrcolbgd")
    var bwa_bel_bhr_chl = MapCard("bwa", "bel", "bhr", "chl", "bel", "bwabelbhrchl")
    var caf_afg_alb_arg = MapCard("caf", "afg", "alb", "arg", "afg", "cafafgalbarg")
    var che_tkm_tur_sur = MapCard("che", "tkm", "tur", "sur", "tkm", "chetkmtursur")
    var cri_cmr_btn_bih = MapCard("cri", "cmr", "btn", "bih", "cmr", "cricmrbtnbih")
    var sau_blz_deu_dza = MapCard("sau", "blz", "deu", "dza", "blz", "saublzdeudza")
    var svn_tha_tcd_pry = MapCard("svn", "tha", "tcd", "pry", "tha", "svnthatcdpry")
    var swe_tls_tgo_per = MapCard("swe", "tls", "tgo", "per", "tls", "swetlstgoper")
    var tjk_pan_svk_tza = MapCard("tjk", "pan", "svk", "tza", "pan", "tjkpansvktza")
    var ven_zwl_yem_ukr = MapCard("ven", "zwl", "yem", "ukr", "zwl", "venzwlyemukr")
    var zmb_tur_ury_vnm = MapCard("zmb", "tur", "ury", "vnm", "tur", "zmbtururyvnm")


    var flagcountrylist = mutableListOf<FlagCard>(
        afg_col,
        arg_svk,
        arm_che,
        aut_tgo,
        aze_pry,
        bhr_tur,
        bra_tls,
        bwa_sur,
        caf_btn,
        cri_tun,
        pan_dza,
        per_sau,
        svn_ago,
        swe_ben,
        tcd_gbr,
        tha_bol,
        tjk_deu,
        tkm_bel,
        tza_blz,
        ukr_cmr,
        ury_blr,
        ven_bgd,
        vnm_bfa,
        yem_bih,
        zmb_chl,
        zwe_alb
    )


    val flagadapter = FlagAdapter(flagcountrylist, this)


    var countryList = listOf<CountryCard>(
        afg,
        ago,
        alb,
        arg,
        arm,
        aut,
        aze,
        bel,
        bfa,
        bhr,
        bih,
        blz,
        blz,
        bol,
        bra,
        btn,
        bwa,
        caf,
        che,
        chl,
        cmr,
        col,
        cri,
        deu,
        gbr,
        pan,
        per,
        pry,
        sau,
        sur,
        svk,
        svn,
        swe,
        tcd,
        tgo,
        tha,
        tjk,
        tkm,
        tls,
        tun,
        tur,
        tza,
        ukr,
        ury,
        ven,
        vnm,
        yem,
        zmb,
        zwe
    )
    val countryadapter = CountryAdapter(countryList)


    var mapcountrylist = listOf<MapCard>(
        arm_bol_gbr_ago,
        aze_bra_aut_ben,
        bfa_blr_col_bgd,
        bwa_bel_bhr_chl,
        caf_afg_alb_arg,
        che_tkm_tur_sur,
        cri_cmr_btn_bih,
        sau_blz_deu_dza,
        svn_tha_tcd_pry,
        swe_tls_tgo_per,
        tjk_pan_svk_tza,
        ven_zwl_yem_ukr,
        zmb_tur_ury_vnm
    )
    val mapadapter = MapAdapter(mapcountrylist)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flagsrecyclerView = findViewById<RecyclerView>(R.id.flagsRecyclerView)
        flagsrecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        flagsrecyclerView.adapter = flagadapter


        val countryrecyclerView = findViewById<RecyclerView>(R.id.countriesRecyclerView)
        countryrecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        countryrecyclerView.adapter = countryadapter


        val maprecyclerView = findViewById<RecyclerView>(R.id.mapsRecyclerView)
        maprecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        maprecyclerView.adapter = mapadapter

    }

    fun rotateFlagCard (flagCard: FlagCard, position: Int) : FlagCard {

        var flagtrigramuplist: List<String> = flagcountrylist.map{it.flagtrigramup }
        var iflagtrigramup : String = flagtrigramuplist[position]

        var flagimagelist = flagcountrylist.map{it.flagimage}
        var iflagimage = flagimagelist[position]
        var flagsouthlist = flagcountrylist.map { it.flagsouth }
        var iflagsouth = flagsouthlist[position]
        var rotationpossiblelist : List<Boolean> = flagcountrylist.map{ it.rotationpossible }
        var irotationpossible = rotationpossiblelist[position]
        var iflagimageView = findViewById<ImageView>(R.id.flagcountry)
        var iflagcardView = findViewById<CardView>(R.id.flag_card_view)
        when (position) {
            0 ->  iflagimageView.setImageResource(R.drawable.afgcol)
            1 -> iflagimageView.setImageResource(R.drawable.argsvk)
            2 -> iflagimageView.setImageResource(R.drawable.armche)
            3 ->  iflagimageView.setImageResource(R.drawable.auttgo)
            4 -> iflagimageView.setImageResource(R.drawable.azepry)
            5 ->  iflagimageView.setImageResource(R.drawable.bhrtur)
            6 ->  iflagimageView.setImageResource(R.drawable.bratls)
            7 ->  iflagimageView.setImageResource(R.drawable.bwasur)
            8 ->  iflagimageView.setImageResource(R.drawable.cafbtn)
            9 ->  iflagimageView.setImageResource(R.drawable.critun)
            10 ->  iflagimageView.setImageResource(R.drawable.pandza)
            11 ->  iflagimageView.setImageResource(R.drawable.persau)
            12 ->  iflagimageView.setImageResource(R.drawable.svnago)
            13 ->  iflagimageView.setImageResource(R.drawable.sweben)
            14 ->  iflagimageView.setImageResource(R.drawable.tcdgbr)
            15 ->  iflagimageView.setImageResource(R.drawable.thabol)
            16 ->  iflagimageView.setImageResource(R.drawable.tjkdeu)
            17 ->  iflagimageView.setImageResource(R.drawable.tkmbel)
            18 ->  iflagimageView.setImageResource(R.drawable.tzablz)
            19 ->  iflagimageView.setImageResource(R.drawable.ukrcmr)
            20 ->  iflagimageView.setImageResource(R.drawable.uryblr)
            21 ->  iflagimageView.setImageResource(R.drawable.venbgd)
            22 ->  iflagimageView.setImageResource(R.drawable.vnmbfa)
            23 ->  iflagimageView.setImageResource(R.drawable.yembih)
            24 ->  iflagimageView.setImageResource(R.drawable.zmbchl)
            25 ->  iflagimageView.setImageResource(R.drawable.zwealb)
            else -> throw AssertionError()
        }

        if (irotationpossible)
        {
            iflagcardView.animate().apply {
                rotationBy(180f)
                duration = 1000L
                start()
                // permutation of values north south
                var flagtrigramdownlist :List<String> = flagcountrylist.map{it.flagtrigramdown}
                var iflagtrigramdown : String = flagtrigramdownlist[position]
                var flagtempup: String = iflagtrigramup
                var flagtempdown: String = iflagtrigramdown
                iflagtrigramup = iflagsouth
                iflagsouth = flagtempup
                iflagtrigramdown = flagtempup

                var iflagCard = FlagCard( iflagtrigramup, iflagtrigramdown, iflagimage, iflagsouth, irotationpossible )
                //flagcountrylist.toSet(position, iflagCard)
                //abstract operator fun set(position: Int, iflagCard: FlagCard): FlagCard
                flagcountrylist.removeAt(position)
                flagcountrylist.add(position, iflagCard)
                return iflagCard
            }
        } else {
            return flagCard
            //Toast.makeText(this, "flag already matched country", Toast.LENGTH_LONG).show()
        }
    }


    override fun onClick(flagcardView: View) {
        if (flagcardView.tag != null) {
            val index = flagcardView.tag as Int
            var flagsouthList: List<String> = flagcountrylist.map { it.flagsouth }
            val flags = flagsouthList[index]
            Toast.makeText(this, "country : ${flags}", Toast.LENGTH_LONG).show()
            var flagcard:FlagCard = flagcountrylist[index]
            rotateFlagCard (flagcard, index)

        }
    }

}
