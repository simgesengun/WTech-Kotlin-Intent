package com.simgesengun.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("onCreate","çalıştı")
    }

    override fun onStart() {
        super.onStart()
        Log.e("onStart","çalıştı")
    }

    override fun onResume() {
        super.onResume()
        Log.e("onResume","çalıştı")
    }

    override fun onPause() {
        super.onPause()
        Log.e("onPause","çalıştı")
    }

    override fun onStop() {
        super.onStop()
        Log.e("onStop","çalıştı")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy","çalıştı")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("onRestart","çalıştı")
    }
}