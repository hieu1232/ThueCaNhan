package hieusenpaj.com.thuecanhan.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.github.nkzawa.socketio.client.Socket
import hieusenpaj.com.thuecanhan.R
import hieusenpaj.com.thuecanhan.`object`.GiayNopTien
import hieusenpaj.com.thuecanhan.`object`.LapGiayNopThue
import hieusenpaj.com.thuecanhan.helper.*
import kotlinx.android.synthetic.main.activity_giay_nop_tien.*
import kotlinx.android.synthetic.main.toolbar.*

class ConfirmGiayNopTienActivity : AppCompatActivity() {
    var byteArray:ByteArray ?=null
    var byteArrayBill:ByteArray ?=null
    var mSocket: Socket? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_giay_nop_tien)
        mSocket= CreatSocket()
        val giayNopTien = intent.getSerializableExtra("object") as GiayNopTien
        val giayNopThue = intent.getSerializableExtra("objectGNT") as LapGiayNopThue
        setSupportActionBar(toolbar)

        iv_back.setOnClickListener {
            onBackPressed()
        }
        iv_confirm.setOnClickListener {
            var value_bill =  GiayNopTienHTML(giayNopTien).toByteArray(Charsets.UTF_8)
            var value =  LapGiayNopThueHTML(giayNopThue).toByteArray(Charsets.UTF_8)
            mSocket!!.emit( "LUU_NOP_THUE",value,value_bill, getTime() + "-"+ getDate(),
                getSharedPreferences("hieu", Context.MODE_PRIVATE).getString("mst",""))
            startActivity(Intent(this,MainActivity::class.java))
        }
        setupWV(giayNopTien)
    }
    private fun setupWV(giayNopTien: GiayNopTien) {
        wv.settings.javaScriptEnabled = true
        wv.webViewClient = WebViewClient()
        wv.loadDataWithBaseURL(
            "file:///android_asset/",
            GiayNopTienHTML(giayNopTien), "text/html", "UTF-8", null
        )
    }
}
