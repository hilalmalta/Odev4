package com.example.intentdev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityB : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val button_y : Button = findViewById(R.id.button_y)

        val i = Intent(this, ActivityY::class.java)

        button_y.setOnClickListener {
            startActivity(i)
        }

    }
}