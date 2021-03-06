package hieusenpaj.com.thuecanhan.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

import hieusenpaj.com.thuecanhan.R
import hieusenpaj.com.thuecanhan.`object`.GiayNopTien
import hieusenpaj.com.thuecanhan.`object`.ItemPicker
import hieusenpaj.com.thuecanhan.`object`.LapGiayNopThue
import hieusenpaj.com.thuecanhan.dialog.DialogPicker
import hieusenpaj.com.thuecanhan.helper.LapGiayNopThueHTML
import com.github.nkzawa.socketio.client.IO
import com.github.nkzawa.socketio.client.Socket
import hieusenpaj.com.thuecanhan.helper.CreatSocket
import hieusenpaj.com.thuecanhan.helper.getDate
import kotlinx.android.synthetic.main.activity_lap_giay_nop_thue.*
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONObject


class LapGiayNopThueActivity : AppCompatActivity() {
    var socket : Socket?=null
    var name = ""
    var address = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lap_giay_nop_thue)

//        mSocket!!.emit( "connection","hi")

        setUpOnClickTv()
        startAcGNT()
    }
    private fun startAcGNT(){
        btn_tt.setOnClickListener {
            val (lapGiayNopThue,giaynoptien) = takeObject()
            val intent = Intent(this,ConfirmLapGiayNopThueActivity::class.java)
            intent.putExtra("object",lapGiayNopThue)
            intent.putExtra("objectGNT",giaynoptien)
            startActivity(intent)


        }
    }
    private fun takeObject(): Pair<LapGiayNopThue,GiayNopTien>{
        var time = getDate()
        var mst =  getSharedPreferences("hieu", Context.MODE_PRIVATE).getString("mst"," ")


        var name = getSharedPreferences("hieu", Context.MODE_PRIVATE).getString("name"," ")
        var address=  getSharedPreferences("hieu", Context.MODE_PRIVATE).getString("address"," ")
        var cb1: String = "V"
        var cb2: String = "V"
        val p1 = ed_p1.text.toString()
        val p2 = ed_p2.text.toString()
        val p3 = ed_p3.text.toString()
        val p4 = ed_p4.text.toString()
        val p5 = ed_p5.text.toString()
        val p6 = ed_p6.text.toString()
        val p7 = ed_p7.text.toString()
        val p8 = ed_p8.text.toString()
        val p9 = ed_p9.text.toString()
        val p10 = ed_p10.text.toString()
        val p11 = ed_p11.text.toString()
        val p12 = ed_p12.text.toString()
        val p13 = ed_p13.text.toString()
        val p14 = ed_p14.text.toString()
        val p15 = ed_p15.text.toString()
        val p16 = ed_p16.text.toString()
        val p17 = ed_p17.text.toString()
        val p18 = ed_p18.text.toString()
        val p19 = ed_p19.text.toString()
        val p20 = ed_p20.text.toString()
        val p21 = ed_p21.text.toString()
        val p22 = ed_p22.text.toString()
        val p23 = ed_p23.text.toString()
        val p24 = ed_p24.text.toString()
        return (LapGiayNopThue(time, mst!!, name!!, address!!, cb1, cb2, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24) to
                GiayNopTien(name,mst,address,p8,p9,p10,p12,p13,p14,p15,p17,p18,p19,p20,p22,p23,p24))

    }

    private fun setUpOnClickTv(){
        val arr1 = ArrayList<ItemPicker>()
        arr1.add(ItemPicker("Quan Doi",false))
        arr1.add(ItemPicker("VCB",false))
        arr1.add(ItemPicker("AGB",false))
        ll_1.setOnClickListener {
//            setUpDialog("Chọn ngân hàng",arr1,ed_p1)
        }
    }
    private fun setUpDialog(title:String,arrayList: ArrayList<ItemPicker>,tv:TextView){
        val dialog = DialogPicker(this,title,arrayList,object : DialogPicker.SetOnClick{
            override fun onClick(string: String) {
                tv.text = string

            }

        })
        dialog.show()
    }

}
