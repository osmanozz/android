package com.example.uurloon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOpen : Button = findViewById(R.id.buttonRegisterr)
        btnOpen.setOnClickListener {
            val intent = Intent (this, activity2 :: class.java)
            startActivity(intent)
        }
    }

    }
