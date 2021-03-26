package com.example.intentdev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityA : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        val button_b : Button = findViewById(R.id.button_b)

        val i = Intent(this, ActivityB::class.java)

        button_b.setOnClickListener {
            startActivity(i)
        }
    }
}