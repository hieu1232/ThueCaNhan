package hieusenpaj.com.thuecanhan.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.github.nkzawa.emitter.Emitter
import com.github.nkzawa.socketio.client.Socket
import hieusenpaj.com.thuecanhan.R
import hieusenpaj.com.thuecanhan.`object`.DangKy
import hieusenpaj.com.thuecanhan.dialog.DialogMST
import hieusenpaj.com.thuecanhan.helper.CreatSocket
import kotlinx.android.synthetic.main.activity_login.*
import org.json.JSONObject


class LoginActivity : AppCompatActivity() {
    var socket: Socket? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(getSharedPreferences("hieu", Context.MODE_PRIVATE).getString("mst","") !=""){
            startActivity(Intent(this,MainActivity::class.java))
        }else{
            setContentView(R.layout.activity_login)
        }

        socket = CreatSocket()
        DangKy()
        startActivityMain()


    }

    override fun onStart() {
        super.onStart()

    }

    private fun DangKy() {
        tv_sign_up.setOnClickListener {
            //            Toast.makeText(this,ed_mst.text.toString(),Toast.LENGTH_SHORT).show()
            val dialog = DialogMST(this, object : DialogMST.SetOnClick {
                override fun onClick(mst: String) {
                    socket!!.emit("mst", mst)





                    socket!!.on("hienthi") { args ->
                        runOnUiThread {
                            val data = args[0] as JSONObject
                            val kq = data.getJSONArray("noidung")
                            if (kq.length() > 0) {
                                var ob = kq[0] as JSONObject
                                val name = ob.getString("name")
                                val address = ob.getString("address")
                                val idCard = ob.getString("idCard")
                                val taxAuthorities = ob.getString("taxAuthorities")
                                val password = ob.getString("password")
                                val intent = Intent(this@LoginActivity,RegisterActivity::class.java);
                                intent.putExtra("name",name)
                                intent.putExtra("address",address);
                                intent.putExtra("idCard",idCard)
                                intent.putExtra("tax",taxAuthorities)
                                intent.putExtra("mst",mst)

                                startActivity(intent)
                                val sharedPreferences = getSharedPreferences("hieu", Context.MODE_PRIVATE)
                                val edit = sharedPreferences.edit()
                                edit.putString("password",password);
                                edit.putString("mst",mst)
                                edit.putString("name",name)
                                edit.apply()

                            } else {
                                Toast.makeText(
                                    this@LoginActivity,
                                    "False",
                                    Toast.LENGTH_SHORT
                                ).show()
                            }

                        }

                        //

                    }


                }

            })
            dialog.show()
        }
    }

    private fun startActivityMain() {
        ll_login.setOnClickListener {
            val mst = ed_mst.text.toString();
            val password = ed_password.text.toString();

            socket!!.emit("login", mst, password)
            socket!!.on("kqlogin") { args ->
                runOnUiThread {
                    val data = args[0] as JSONObject
                    val kq = data.getBoolean("noidung")
                    if (kq) {
                        startActivity(Intent(this, MainActivity::class.java))
                        val sharedPreferences = getSharedPreferences("hieu", Context.MODE_PRIVATE)
                        val edit = sharedPreferences.edit()
                        edit.putString("mst",mst)
                        edit.apply()
                    } else {
                        Toast.makeText(this, kq.toString(), Toast.LENGTH_SHORT).show()
                    }
                }

            }

        }
    }



}
