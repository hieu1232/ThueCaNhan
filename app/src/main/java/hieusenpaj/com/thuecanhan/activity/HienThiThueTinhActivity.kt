package hieusenpaj.com.thuecanhan.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.widget.Toast
import hieusenpaj.com.thuecanhan.R
import hieusenpaj.com.thuecanhan.`object`.TinhThue
import hieusenpaj.com.thuecanhan.helper.*
import kotlinx.android.synthetic.main.activity_hien_thi_thue.*

class HienThiThueTinhActivity : AppCompatActivity() {
    var tinhThue: TinhThue? = null
    var lcb = "0"
    var lbh = "0"
    var pc = "0"
    var giam = "0"
    var npt ="0"
    var sum1 ="0"
    var sum2 = "0"
    var sum3 ="0"
    var sum4 ="0"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hien_thi_thue)
        tinhThue = intent.getSerializableExtra("object") as TinhThue
        lcb = tinhThue!!.lcb
        lbh = tinhThue!!.lbh!!
        pc = tinhThue!!.pc!!
        giam = tinhThue!!.giam!!
        npt = tinhThue!!.npt
        if(TextUtils.isEmpty(tinhThue!!.npt)){
            npt = "0"
        }
        displayTTN()
        displayBH()
        displayGiam()
        displayTNTT()

    }


    private fun displayTTN() {
        sum1 = DisplaySum(lcb, pc)
        tv_all_tn.text = "${sum1} đ"
        tv_lcb.text = "$lcb đ"
        tv_pc.text = "$pc đ"


    }
    @SuppressLint("SetTextI18n")
    private fun displayBH(){

        val bhxh =(lbh.replaceUnit().toLong()*0.08).toLong()
        val bhyt =(lbh.replaceUnit().toLong()*0.015).toLong()
        val bhtn =(lbh.replaceUnit().toLong()*0.01).toLong()
        tv_lbh.text = "$lbh đ"
        tv_bhxh.text = "${bhxh.formatDecimal()} đ"
        tv_bhyt.text = "${bhyt.formatDecimal()} đ"
        tv_bhtn.text = "${bhtn.formatDecimal()} đ"
        sum2 = DisplaySum(bhxh.toString(),bhyt.toString(),bhtn.toString())
        tv_all_bh.text ="${sum2} đ"


    }
    @SuppressLint("SetTextI18n")
    private fun displayGiam(){
        sum3 = DisplaySum("9000000",(3600000*npt.toLong()).toString(),giam)
        tv_all_giam.text = "${sum3} đ"
        tv_gpt.text = "${(3600000*npt.toLong()).formatDecimal()} đ"
        tv_gt.text ="$giam đ"

    }
    private fun displayTNTT(){
        sum4 = Minus(sum1.replaceUnit().toLong(),sum2.replaceUnit().toLong(),sum3.replaceUnit().toLong()).toString()
        tv_tntt.text = DislayMinus(sum1,sum2,sum3)
        val thueThuNhap = sum4.toLong().ThueTNCN()
        tv_tpd.text = thueThuNhap.sum
        tv_05.text = thueThuNhap.p05
        tv_510.text = thueThuNhap.p510
        tv_1018.text = thueThuNhap.p1018
        tv_1832.text = thueThuNhap.p1832
        tv_3252.text = thueThuNhap.p3252
        tv_5280.text = thueThuNhap.p5280
        tv_80.text = thueThuNhap.p80
        tv_tnst.text = DislayMinus(sum1,sum2,thueThuNhap.sum)

    }



}
