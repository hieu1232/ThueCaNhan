package hieusenpaj.com.thuecanhan.activity

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.github.nkzawa.socketio.client.IO
import com.github.nkzawa.socketio.client.Socket
import hieusenpaj.com.thuecanhan.R
import hieusenpaj.com.thuecanhan.helper.CreatSocket
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONObject

import java.net.URISyntaxException


class MainActivity : AppCompatActivity() {
    var sharedPreferences: SharedPreferences? = null
    var edit: SharedPreferences.Editor? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var socket = CreatSocket()
        sharedPreferences = getSharedPreferences("hieu", Context.MODE_PRIVATE)
        edit = sharedPreferences!!.edit()
        socket!!.emit("mst", sharedPreferences!!.getString("mst", ""))
        socket.on("hienthi") { args ->
            runOnUiThread {
                val data = args[0] as JSONObject
                val kq = data.getJSONArray("noidung")
                if (kq.length() > 0) {
                    var ob = kq[0] as JSONObject
                    tv_name.text = ob.getString("name")
                    edit!!.putString("name", ob.getString("name"))
                    edit!!.putString("address", ob.getString("address"))
                    edit!!.apply()

                }

                //

            }
        }


        tv_mst.text = sharedPreferences!!.getString("mst", "")

        startActivity()

    }

    private fun startActivity() {
        rl_khai_thue.setOnClickListener {
            startActivity(Intent(this, KhaiThueActivity::class.java))
        }
        rl_nop_thue.setOnClickListener {
            startActivity(Intent(this, LapGiayNopThueActivity::class.java))
        }
        rl_tinh_thue.setOnClickListener {
            startActivity(Intent(this, TinhThueActivity::class.java))
        }
        rl_dang_xuat.setOnClickListener {
            edit!!.putString("name", "")
            edit!!.putString("mst", "")
            edit!!.putString("address","")
            edit!!.apply()
            startActivity(Intent(this, LoginActivity::class.java))
        }

    }

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }
}
