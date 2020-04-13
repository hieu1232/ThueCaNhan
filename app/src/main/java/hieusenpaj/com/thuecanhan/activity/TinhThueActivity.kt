package hieusenpaj.com.thuecanhan.activity

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import hieusenpaj.com.thuecanhan.R
import hieusenpaj.com.thuecanhan.`object`.TinhThue
import hieusenpaj.com.thuecanhan.helper.replaceUnit
import hieusenpaj.com.thuecanhan.helper.setUpListenerEdit
import kotlinx.android.synthetic.main.activity_tinh_thue.*
import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.*


class TinhThueActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tinh_thue)
        setUpEdit()
        startAC()

    }

    private fun setUpEdit() {
        ed_lcb.setUpListenerEdit()
        ed_ldbh.setUpListenerEdit()
        ed_pc.setUpListenerEdit()
        ed_giam.setUpListenerEdit()

    }

    private fun startAC() {
        btn_tt.setOnClickListener {
            startActivity(
                Intent(this, HienThiThueTinhActivity::class.java).putExtra(
                    "object",
                    takeObject()
                )
            )
        }
    }

    private fun takeObject(): TinhThue {
        val lcb = ed_lcb.text.toString()
        val lbh = ed_ldbh.text.toString()
        val pc = ed_pc.text.toString()
        val giam = ed_giam.text.toString()
        val npc = ed_npc.text.toString()
        return TinhThue(lcb, lbh, pc, giam, npc)

    }



}
