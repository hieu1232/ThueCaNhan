package hieusenpaj.com.thuecanhan.dialog

import android.app.Dialog
import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.WindowManager
import android.widget.LinearLayout
import hieusenpaj.com.thuecanhan.R
import kotlinx.android.synthetic.main.dialog_mst.*

class DialogMST(context: Context,private val setOnClick:SetOnClick):Dialog(context) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setCancelable(false)
        window!!.setBackgroundDrawable(ColorDrawable(0))
        setContentView(R.layout.dialog_mst)
        window!!.setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)

        ed_mst.setSelectAllOnFocus(true)
        ed_mst.requestFocus();
        window!!.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE)
        tv_back.setOnClickListener {
            dismiss()
        }
        tv_tt.setOnClickListener {
            setOnClick.onClick(ed_mst.text.toString())
        }
    }
    interface SetOnClick {
        fun onClick(mst:String)
    }
}