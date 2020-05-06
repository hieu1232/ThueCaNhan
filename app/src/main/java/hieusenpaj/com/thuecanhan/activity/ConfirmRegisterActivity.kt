package hieusenpaj.com.thuecanhan.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.github.nkzawa.socketio.client.Socket
import hieusenpaj.com.thuecanhan.R
import hieusenpaj.com.thuecanhan.`object`.DangKy
import hieusenpaj.com.thuecanhan.`object`.KhaiThue
import hieusenpaj.com.thuecanhan.helper.*
import kotlinx.android.synthetic.main.activity_confirm_register.*
import kotlinx.android.synthetic.main.toolbar.*
import org.jsoup.Jsoup
import org.jsoup.nodes.Document


class ConfirmRegisterActivity : AppCompatActivity() {
    var byteArray:ByteArray ?=null
    var mSocket: Socket? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm_register)
        mSocket = CreatSocket()
        setSupportActionBar(toolbar)
        val dangKy:DangKy = intent.getSerializableExtra("objectDK") as DangKy
        iv_back.setOnClickListener {
            onBackPressed()
        }
        iv_confirm.setOnClickListener {
            var value = DangKyHTML(dangKy).toByteArray(Charsets.UTF_8)
            mSocket!!.emit( "LUU_DANG_KY",value, getTime() + "-"+ getDate(),
                getSharedPreferences("hieu", Context.MODE_PRIVATE).getString("mst",""))
            startActivity(Intent(this,MainActivity::class.java))
        }



        wv.settings.javaScriptEnabled = true
        wv.webViewClient =WebViewClient()
        wv.loadDataWithBaseURL("file:///android_asset/",
            DangKyHTML(dangKy),"text/html", "UTF-8",null)


    }
}
