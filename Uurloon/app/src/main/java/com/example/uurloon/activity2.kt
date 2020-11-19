package com.example.uurloon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity2)

        val btnOpen : Button = findViewById(R.id.buttonBack)
        btnOpen.setOnClickListener {
            val intent = Intent (this, MainActivity :: class.java)
            startActivity(intent)
        }
    }
}