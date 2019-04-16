package com.example.simplecustomdialogs

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.TextView
import android.widget.Toast

class MyCustomDialog (context: Context) : Dialog(context), View.OnClickListener {

    lateinit var option_1: TextView
    lateinit var option_2: TextView
    lateinit var option_3: TextView
    lateinit var log_in_btn: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.my_custom_dialog)

        //todo: hide by reason
        option_1 = findViewById(R.id.option_1)
        option_2 = findViewById(R.id.option_2)
        option_3 = findViewById(R.id.option_3)
        log_in_btn = findViewById(R.id.log_in)
        log_in_btn.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.log_in -> {
               Toast.makeText(context, "loging in", Toast.LENGTH_SHORT).show()
            }
            else -> dismiss()
        }
    }
}