package com.example.lifecyclesample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("onCreate method", "is called...")

        val btnSubmit = findViewById<Button>(R.id.btn_submit)

        btnSubmit.setOnClickListener {
            val intent = Intent(this, AnotherActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()

        Log.e("onStart method", "is called...")
    }

    override fun onResume() {
        super.onResume()

        Log.e("onResume method", "is called...")
    }

    override fun onPause() {
        super.onPause()

        Log.e("onPause method", "is called...")
    }

    override fun onStop() {
        super.onStop()

        Log.e("onStop method", "is called...")
    }

    override fun onRestart() {
        super.onRestart()

        Log.e("onRestart method", "is called...")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.e("onDestroy method", "is called...")
    }
}