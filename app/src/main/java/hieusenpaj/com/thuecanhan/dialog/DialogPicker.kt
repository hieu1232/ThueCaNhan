package hieusenpaj.com.thuecanhan.dialog

import android.app.Dialog
import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import hieusenpaj.com.thuecanhan.R
import hieusenpaj.com.thuecanhan.`object`.ItemPicker
import hieusenpaj.com.thuecanhan.adapter.PickerAdapter
import kotlinx.android.synthetic.main.dialog_picker.*

class DialogPicker(context: Context,
                   var title:String,
                   var arrayList: ArrayList<ItemPicker>,
                   var litener:SetOnClick):Dialog(context) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window!!.setBackgroundDrawable(ColorDrawable(0))
        window!!.setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        setContentView(R.layout.dialog_picker)

        rv.layoutManager = LinearLayoutManager(context)
        val adapter = PickerAdapter(context,arrayList)
        rv.adapter = adapter

        tv_title.text = title

        tv_back.setOnClickListener {
            dismiss()
        }
        tv_tt.setOnClickListener {
            var string =""
            for (item in arrayList){
                if(item.isPicker){
                    string = item.title
                }
            }

            litener.onClick(string)
            dismiss()
        }
    }
    interface SetOnClick{
        fun onClick(string: String)
    }
}