package com.example.bdact

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Password : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_password)

        val btnBack = findViewById<Button>(R.id.backButton)
        btnBack.setOnClickListener {
            val intent = Intent(this, Registration_fingerprint::class.java)
            startActivity(intent)
        }
        val btnNext = findViewById<Button>(R.id.nextButton)
        btnNext.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}