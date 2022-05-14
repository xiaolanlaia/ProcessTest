package com.example.processtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test_btn.setOnClickListener {
            Constance.testInt = 2
            Log.d("__testInt-1","${Constance.testInt}")
            startActivity(Intent(this@MainActivity,SecondActivity::class.java))
        }
    }
}