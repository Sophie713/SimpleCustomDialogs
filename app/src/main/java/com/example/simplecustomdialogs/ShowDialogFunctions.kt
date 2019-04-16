package com.example.simplecustomdialogs

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import java.lang.Exception

object ShowDialogFunctions {

    fun showMyDialog(context: Context) {
        val cdd = MyCustomDialog(context)
        cdd.setCancelable(false)
        try {
            cdd!!.getWindow().setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT));
        } catch (e: Exception) {}
        cdd.show()
    }
}