package com.example.intentdev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityX : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_x)
        val button_xy : Button = findViewById(R.id.button_xy)

        val i = Intent(this, ActivityY::class.java)

        button_xy.setOnClickListener {
            startActivity(i)
        }

    }
}