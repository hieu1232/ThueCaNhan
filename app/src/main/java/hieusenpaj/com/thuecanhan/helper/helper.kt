package hieusenpaj.com.thuecanhan.helper

import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import com.github.nkzawa.socketio.client.IO
import com.github.nkzawa.socketio.client.Socket
import hieusenpaj.com.thuecanhan.`object`.ThueThuNhap
import java.net.URISyntaxException
import java.text.DecimalFormat
import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.util.*

inline fun EditText.setUpListenerEdit() {
    addTextChangedListener(object : TextWatcher {
        override fun afterTextChanged(p0: Editable?) {
            removeTextChangedListener(this)

            try {
                var originalString: String = p0.toString()
                val longval: Long
                if (originalString.contains(",")) {
                    originalString = originalString.replaceUnit()
                }
                longval = originalString.toLong()


                val formattedString: String = longval.formatDecimal()
                //setting text after format to EditText
                setText(formattedString)
                setSelection(text.length)
            } catch (nfe: NumberFormatException) {
                nfe.printStackTrace()
            }

            addTextChangedListener(this)
        }

        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }

    })
}

inline fun Long.formatDecimal(): String {
    val formatter: DecimalFormat =
        NumberFormat.getInstance(Locale.US) as DecimalFormat
    formatter.applyPattern("#,###,###,###")
    return formatter.format(this)
}

inline fun String.replaceUnit(): String {
    return replace(",".toRegex(), "")
}

inline fun Sum(a: Long, b: Long, c: Long): Long = a + b + c
inline fun Sum(a: Long, b: Long): Long = a + b
inline fun Minus(a: Long, b: Long, c: Long): Long = a - b - c
inline fun DisplaySum(a: String, b: String, c: String): String {
    return Sum(
        a.replaceUnit().toLong(),
        b.replaceUnit().toLong(),
        c.replaceUnit().toLong()
    ).formatDecimal()
}

inline fun DisplaySum(a: String, b: String): String {
    return Sum(a.replaceUnit().toLong(), b.replaceUnit().toLong()).formatDecimal()
}

inline fun DislayMinus(a: String, b: String, c: String): String {
    return Minus(
        a.replaceUnit().toLong(),
        b.replaceUnit().toLong(),
        c.replaceUnit().toLong()
    ).formatDecimal()

}
inline fun Long.ThueTNCN():ThueThuNhap{
    val p05 = (this.TrongKhoang(0,5000000)*0.05).toLong()
    val p510 = (this.TrongKhoang(5000000,10000000)*0.1).toLong()
    val p1018 = (this.TrongKhoang(10000000,18000000)*0.15).toLong()
    val p1832 = (this.TrongKhoang(18000000,32000000)*0.2).toLong()
    val p3252 = (this.TrongKhoang(32000000,52000000)*0.25).toLong()
    val p5280 = (this.TrongKhoang(52000000,80000000)*0.3).toLong()
    val p80 = (this.Max(8000000)*0.35).toLong()
    val sum  = p05+p510+p1018+p1832+p3252+p5280+p80
    return ThueThuNhap(sum.formatDecimal(),p05.formatDecimal(),p510.formatDecimal(),p1018.formatDecimal(),
            p1832.formatDecimal(),p3252.formatDecimal(),p5280.formatDecimal(),p80.formatDecimal())

}
inline fun Long.TrongKhoang(dau:Long,cuoi:Long) :Long{
    if(this<=dau) return 0
    if (this>cuoi) return cuoi-dau

    return this-dau

}
inline fun Long.Max(cuoi: Long):Long{
    if (this>cuoi) this-cuoi
    return 0
}
inline fun CreatSocket():Socket{
    var mSocket: Socket? = null
    try {
        mSocket = IO.socket("http://192.168.1.218:3000/")
        Log.e("CONNECTED", "SUCCESS")
    } catch (e: URISyntaxException) {
        Log.e("ERROR", "ERROR CONNECTING")
    }
    mSocket!!.connect()
   return mSocket;
}
inline fun getTime():String{
    var saveCurrentTime = ""

    val calendar = Calendar.getInstance()


    val currentTime = SimpleDateFormat("hh:mm a")
    saveCurrentTime = currentTime.format(calendar.time)
    return saveCurrentTime
}
inline fun getDate():String{

    var saveCurrentDate = ""

    val calendar = Calendar.getInstance()
    val currentDate = SimpleDateFormat("MMM dd, yyy")
    saveCurrentDate = currentDate.format(calendar.time)


    return saveCurrentDate
}

