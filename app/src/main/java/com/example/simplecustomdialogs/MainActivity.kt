package com.example.simplecustomdialogs

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.simplecustomdialogs.ShowDialogFunctions.showMyDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showMyDialog(this)
    }
}
