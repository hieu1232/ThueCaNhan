package hieusenpaj.com.thuecanhan.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hieusenpaj.com.thuecanhan.R
import hieusenpaj.com.thuecanhan.`object`.KhaiThue
import kotlinx.android.synthetic.main.activity_khai_thue.*

class KhaiThueActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_khai_thue)


        setOnClickBTN()
    }


    private fun setOnClickBTN(){
        btn_tt.setOnClickListener{
            startActivity(Intent(this,ConfirmKhaiThueActivity::class.java).putExtra("objectKT",
                takeObject()))
        }
    }
    private fun takeObject() :KhaiThue{
        val p1 = ed_p1.text.toString()
        val p3 = ed_p3.text.toString()
        val p4 = ed_p4.text.toString()
        val p5 = ed_p5.text.toString()
        val p6 = ed_p6.text.toString()
        val p7 = ed_p7.text.toString()
        val p8 = ed_p8.text.toString()
        val p9 = ed_p9.text.toString()
        val p10 = ed_p10.text.toString()
        val p11 = ed_p11.text.toString()
        val p12 = ed_p12.text.toString()
        val p13 = ed_p13.text.toString()
        val p14 = ed_p14.text.toString()
        val p15 = ed_p15.text.toString()
        val p16 = ed_p16.text.toString()
        val p17 = ed_p17.text.toString()
        val p18 = ed_p18.text.toString()
        val p19 = ed_p19.text.toString()
        val p20 = ed_p20.text.toString()
        val p21 = ed_p21.text.toString()
        val p22 = ed_p22.text.toString()
        val p23 = ed_p23.text.toString()
        val p24 = ed_p24.text.toString()
        val p25 = ed_p25.text.toString()
        val p26 = ed_p26.text.toString()
        val p27 = ed_p27.text.toString()
        val p28 = ed_p28.text.toString()
        val p29 = ed_p29.text.toString()
        val p30 = ed_p30.text.toString()
        val p31 = ed_p31.text.toString()
        val p38 = ed_p38.text.toString()
        val p32 = ed_p32.text.toString()
        val p33 = ed_p33.text.toString()
        val p34 = ed_p34.text.toString()
        val p35 = ed_p35.text.toString()
        val p36 = ed_p36.text.toString()
        val p37 = ed_p37.text.toString()
        val p39 = ed_p39.text.toString()
        val p40 = ed_p40.text.toString()
        val p41 = ed_p41.text.toString()
        val p42 = ed_p42.text.toString()
        val p43 = ed_p43.text.toString()
        val p44 = ed_p44.text.toString()
        val p45 = ed_p45.text.toString()
        val p46 = ed_p46.text.toString()
        val p47 = ed_p47.text.toString()
        val p48 = ed_p48.text.toString()
        val p49 = ed_p49.text.toString()


        return KhaiThue(p1,"",p3,p4,p5,p6,p7,p8,p9,p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38, p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49)



    }
}
