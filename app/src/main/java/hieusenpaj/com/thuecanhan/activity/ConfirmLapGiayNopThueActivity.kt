package hieusenpaj.com.thuecanhan.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import hieusenpaj.com.thuecanhan.R
import hieusenpaj.com.thuecanhan.`object`.GiayNopTien
import hieusenpaj.com.thuecanhan.`object`.LapGiayNopThue
import hieusenpaj.com.thuecanhan.helper.LapGiayNopThueHTML
import kotlinx.android.synthetic.main.activity_confirm_lap_giay_nop_thue.*
import kotlinx.android.synthetic.main.toolbar.*

class ConfirmLapGiayNopThueActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm_lap_giay_nop_thue)
        val giayNopThue = intent.getSerializableExtra("object") as LapGiayNopThue
        val giayNopTien = intent.getSerializableExtra("objectGNT") as GiayNopTien
        setupWV(giayNopThue)
        setupToolbar(giayNopTien,giayNopThue)

    }

    private fun setupToolbar(giayNopTien: GiayNopTien,giayNopThue: LapGiayNopThue) {
        setSupportActionBar(toolbar)
        iv_back.setOnClickListener { onBackPressed() }
        iv_confirm.setOnClickListener {
            startGNT(giayNopTien,giayNopThue)
        }
    }

    private fun startGNT(giayNopTien: GiayNopTien,giayNopThue: LapGiayNopThue) {
        val intent = Intent(this,ConfirmGiayNopTienActivity::class.java)
        intent.putExtra("object",giayNopTien)
        intent.putExtra("objectGNT",giayNopThue)
        startActivity(intent)

    }

    private fun setupWV(giayNopThue: LapGiayNopThue) {
        wv.settings.javaScriptEnabled = true
        wv.webViewClient = WebViewClient()
        wv.loadDataWithBaseURL(
            "file:///android_asset/",
            LapGiayNopThueHTML(giayNopThue), "text/html", "UTF-8", null
        )
    }
}
