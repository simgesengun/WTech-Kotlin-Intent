package com.simgesengun.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val button = findViewById<Button>(R.id.buttonThird)

        button.setOnClickListener {
            val newIntent = Intent(this@ThirdActivity,FinalActivity::class.java)
            startActivity(newIntent)
        }
    }
}