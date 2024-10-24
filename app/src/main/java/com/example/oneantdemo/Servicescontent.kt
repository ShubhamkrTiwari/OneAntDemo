package com.example.oneantdemo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Servicescontent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_servicescontent)

        val reachout = findViewById<Button>(R.id.reachout)

        reachout.setOnClickListener {
            val intent = Intent(this, ContactInfo::class.java)
            startActivity(intent)
        }
    }
}