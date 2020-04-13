package hieusenpaj.com.thuecanhan.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import hieusenpaj.com.thuecanhan.R
import hieusenpaj.com.thuecanhan.`object`.GiayNopTien
import hieusenpaj.com.thuecanhan.helper.GiayNopTienHTML
import kotlinx.android.synthetic.main.activity_giay_nop_tien.*

class ConfirmGiayNopTienActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_giay_nop_tien)
        val giayNopTien = intent.getSerializableExtra("object") as GiayNopTien
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
