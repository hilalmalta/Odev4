package com.example.intentdev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_a : Button = findViewById(R.id.button_a)
        val button_x : Button = findViewById(R.id.button_x)


        val i = Intent(this, ActivityA::class.java)
        val intent = Intent(this, ActivityX::class.java)

        button_a.setOnClickListener {
            startActivity(i)
        }

        button_x.setOnClickListener {
            startActivity(intent)
        }






    }
}