package hieusenpaj.com.thuecanhan.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import hieusenpaj.com.thuecanhan.R
import hieusenpaj.com.thuecanhan.`object`.ItemPicker
import kotlinx.android.synthetic.main.item_picker.view.*

class PickerAdapter(var context: Context,
                    var array:ArrayList<ItemPicker>):RecyclerView.Adapter<PickerAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PickerAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_picker,parent,false))
    }

    override fun getItemCount(): Int = array.size


    override fun onBindViewHolder(holder: PickerAdapter.ViewHolder, position: Int) {

        holder.tv.text = array[position].title
        holder.rl.setOnClickListener {
            setAllFalsePicker()
            array[position].isPicker = true
        }
        if(array[position].isPicker){
            holder.iv.visibility = View.VISIBLE
            holder.iv.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.circle))

        }else{
            holder.iv.visibility = View.INVISIBLE
        }
    }
    class ViewHolder(v:View):RecyclerView.ViewHolder(v){
        val tv = v.tv
        val rl = v.rl
        val iv = v.iv
    }
    fun setAllFalsePicker(){
        for (i in array.indices){
            array[i].isPicker = false
        }
        notifyDataSetChanged()
    }
}