package com.example.lifecyclesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class AnotherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)

        val keyValue1 = intent.getStringExtra("Key1")
        val keyValue2 = intent.getDoubleExtra("Key2", 0.0)

        if (keyValue1 != null) Log.e("keyValue1 is", keyValue1)
        Log.e("keyValue2 is", keyValue2.toString())
    }
}