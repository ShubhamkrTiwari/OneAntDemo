package com.example.oneantdemo

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Onboarding : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_homepage)

        val getStartButton = findViewById<Button>(R.id.getstart)

        getStartButton.setOnClickListener {
            val intent = Intent(this, Servicescontent::class.java)
            startActivity(intent)
        }
    }

}