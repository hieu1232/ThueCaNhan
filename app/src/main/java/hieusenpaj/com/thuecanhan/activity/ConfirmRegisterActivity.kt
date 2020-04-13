package hieusenpaj.com.thuecanhan.activity

import android.os.Bundle
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import hieusenpaj.com.thuecanhan.R
import hieusenpaj.com.thuecanhan.`object`.DangKy
import hieusenpaj.com.thuecanhan.`object`.KhaiThue
import hieusenpaj.com.thuecanhan.helper.DangKyHTML
import hieusenpaj.com.thuecanhan.helper.KhaiThueHTML
import kotlinx.android.synthetic.main.activity_confirm_register.*
import org.jsoup.Jsoup
import org.jsoup.nodes.Document


class ConfirmRegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm_register)


        val dangKy:DangKy = intent.getSerializableExtra("objectDK") as DangKy
        wv.settings.javaScriptEnabled = true
        wv.webViewClient =WebViewClient()
        wv.loadDataWithBaseURL("file:///android_asset/",
            DangKyHTML(dangKy),"text/html", "UTF-8",null)
        wv.loadUrl("file:///android_asset/DangKy.html")
    }
}
