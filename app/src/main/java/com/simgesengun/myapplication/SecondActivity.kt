package com.simgesengun.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val button = findViewById<Button>(R.id.buttonSecond)
        val textView = findViewById<TextView>(R.id.textViewSecond)


        /*val gelenUser : User = intent.getSerializableExtra("user") as User

        textView.text = "${gelenUser.name} ${gelenUser.age}"*/

        button.setOnClickListener {
            val newIntent = Intent(this@SecondActivity,ThirdActivity::class.java)
            finish()
            startActivity(newIntent)
        }
    }
}