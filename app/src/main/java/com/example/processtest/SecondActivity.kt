package com.example.processtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        test_btn_2.setOnClickListener {
            val oo = Constance.testInt
            Log.d("__testInt-2","${Constance.testInt}")
            Log.d("__testInt-3","${oo}")
        }
    }
}