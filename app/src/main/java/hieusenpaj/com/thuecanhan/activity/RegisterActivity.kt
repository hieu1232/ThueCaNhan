package hieusenpaj.com.thuecanhan.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import hieusenpaj.com.thuecanhan.R
import hieusenpaj.com.thuecanhan.`object`.DangKy
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        setOnClickButtonTT()

    }
    private fun setOnClickButtonTT(){
        val mst = tv_mst.text.toString()
        val name = tv_name.text.toString()
        val address = tv_address.text.toString()
        val cmt = tv_cmt.text.toString()
        val coquan = tv_co_quan_thue.text.toString()
        val email = ed_email.text.toString()
        val sdt = ed_sdt.text.toString()

        btn_tt.setOnClickListener {
            Toast.makeText(this,ed_email.text.toString(),Toast.LENGTH_SHORT).show()
           val intent = Intent(this,ConfirmRegisterActivity::class.java)
            intent.putExtra("objectDK",DangKy(mst,name,address,cmt,coquan,ed_email.text.toString(),
                ed_sdt.text.toString()))
            startActivity(intent)

        }
    }
}
