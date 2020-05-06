package hieusenpaj.com.thuecanhan.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.github.nkzawa.emitter.Emitter
import com.github.nkzawa.socketio.client.Socket
import hieusenpaj.com.thuecanhan.R
import hieusenpaj.com.thuecanhan.`object`.DangKy
import hieusenpaj.com.thuecanhan.helper.CreatSocket
import kotlinx.android.synthetic.main.activity_register.*
import org.json.JSONObject

class RegisterActivity : AppCompatActivity() {
    var socket: Socket? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        socket = CreatSocket()
//

        display()
        setOnClickButtonTT()

    }

    private fun display() {
        val name = intent.extras!!.getString("name")
        val mst = intent.extras!!.getString("mst")
        val address = intent.extras!!.getString("address")
        val idCard = intent.extras!!.getString("idCard")
        val taxAuthorities = intent.extras!!.getString("tax")
        tv_name.text = name
        tv_mst.text = mst
        tv_address.text = address
        tv_co_quan_thue.text = taxAuthorities
        tv_cmt.text = idCard
    }

    private fun setOnClickButtonTT() {
        btn_tt.setOnClickListener {
            val mst = tv_mst.text.toString()
            val name = tv_name.text.toString()
            val address = tv_address.text.toString()
            val cmt = tv_cmt.text.toString()
            val coquan = tv_co_quan_thue.text.toString()
            val email = ed_email.text.toString()
            val sdt = ed_sdt.text.toString()

            socket!!.emit("dangki", email, sdt)
            socket!!.on("kqDangKi") {
                runOnUiThread {
                    val data = it[0] as JSONObject
                    val kq = data.getBoolean("noidung")
                    if (kq) {
                        val sharedPreferences = getSharedPreferences("hieu", Context.MODE_PRIVATE)
                        val edit = sharedPreferences.edit()
                        edit.putString("mst",mst)
                        edit.putString("name",name)
                        edit.putString("address",address)
                        edit.apply()
                        val intent = Intent(this, ConfirmRegisterActivity::class.java)
                        intent.putExtra(
                            "objectDK", DangKy(
                                mst, name, address, cmt, coquan, ed_email.text.toString(),
                                ed_sdt.text.toString()
                            )
                        )
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, kq.toString(), Toast.LENGTH_SHORT).show()
                    }
                }


            }
        }
    }

}
