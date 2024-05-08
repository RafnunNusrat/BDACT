package com.example.bdact

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Registration_fingerprint : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registration_fingerprint)

        val btnBack = findViewById<Button>(R.id.backButton)
        btnBack.setOnClickListener {
            val intent = Intent(this, Registration_signature::class.java)
            startActivity(intent)
        }
        val btnNext = findViewById<Button>(R.id.nextButton)
        btnNext.setOnClickListener {
            Toast.makeText(this@Registration_fingerprint, "Verification confirmed", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Reg_Con::class.java)

            startActivity(intent)
        }
    }
}