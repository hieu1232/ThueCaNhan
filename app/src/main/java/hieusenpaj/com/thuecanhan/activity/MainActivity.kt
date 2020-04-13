package hieusenpaj.com.thuecanhan.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hieusenpaj.com.thuecanhan.R
import hieusenpaj.com.thuecanhan.dialog.DialogPicker
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivity()

    }
    private fun startActivity(){
        rl_khai_thue.setOnClickListener {
            startActivity(Intent(this,KhaiThueActivity::class.java))
        }
        rl_nop_thue.setOnClickListener {
            startActivity(Intent(this,LapGiayNopThueActivity::class.java))
        }
        rl_tinh_thue.setOnClickListener {
            startActivity(Intent(this,TinhThueActivity::class.java))
        }

    }
}
