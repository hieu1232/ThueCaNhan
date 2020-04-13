package hieusenpaj.com.thuecanhan.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import hieusenpaj.com.thuecanhan.R
import hieusenpaj.com.thuecanhan.dialog.DialogMST
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        DangKy()
        startActivityMain()


    }
    private fun DangKy(){
        tv_sign_up.setOnClickListener {
//            Toast.makeText(this,ed_mst.text.toString(),Toast.LENGTH_SHORT).show()
            val dialog = DialogMST(this,object : DialogMST.SetOnClick{
                override fun onClick() {
                    startActivity(Intent(this@LoginActivity,RegisterActivity::class.java))

                }

            })
            dialog.show()
        }
    }
    private fun startActivityMain(){
        ll_login.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }

    }
}
