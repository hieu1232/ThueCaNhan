package hieusenpaj.com.thuecanhan.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import hieusenpaj.com.thuecanhan.R
import hieusenpaj.com.thuecanhan.`object`.KhaiThue
import hieusenpaj.com.thuecanhan.helper.KhaiThueHTML
import kotlinx.android.synthetic.main.activity_confirm_khai_thue.*

class ConfirmKhaiThueActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm_khai_thue)

        val khaiThue = intent.getSerializableExtra("objectKT") as KhaiThue
        wv.settings.javaScriptEnabled = true
        wv.webViewClient = WebViewClient()
        wv.loadDataWithBaseURL("file:///android_asset/",
            KhaiThueHTML(khaiThue),"text/html", "UTF-8",null)
    }
}
