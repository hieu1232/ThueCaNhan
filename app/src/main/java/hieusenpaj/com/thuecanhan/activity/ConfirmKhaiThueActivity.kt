package hieusenpaj.com.thuecanhan.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.github.nkzawa.socketio.client.Socket
import hieusenpaj.com.thuecanhan.R
import hieusenpaj.com.thuecanhan.`object`.KhaiThue
import hieusenpaj.com.thuecanhan.helper.CreatSocket
import hieusenpaj.com.thuecanhan.helper.KhaiThueHTML
import hieusenpaj.com.thuecanhan.helper.getDate
import hieusenpaj.com.thuecanhan.helper.getTime
import kotlinx.android.synthetic.main.activity_confirm_khai_thue.*
import kotlinx.android.synthetic.main.toolbar.*

class ConfirmKhaiThueActivity : AppCompatActivity() {
    var byteArray:ByteArray ?=null
    var mSocket: Socket? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm_khai_thue)
        mSocket = CreatSocket()
        setSupportActionBar(toolbar)
        val khaiThue = intent.getSerializableExtra("objectKT") as KhaiThue
        iv_back.setOnClickListener {
            onBackPressed()
        }
        iv_confirm.setOnClickListener {
            var value =  KhaiThueHTML(khaiThue).toByteArray(Charsets.UTF_8)
            mSocket!!.emit( "LUU_KHAI_THUE",value, getTime() + "-"+ getDate(),
                getSharedPreferences("hieu", Context.MODE_PRIVATE).getString("mst",""))
            startActivity(Intent(this,MainActivity::class.java))
        }

        wv.settings.javaScriptEnabled = true
        wv.webViewClient = WebViewClient()
        wv.loadDataWithBaseURL("file:///android_asset/",
            KhaiThueHTML(khaiThue),"text/html", "UTF-8",null)
    }
}
