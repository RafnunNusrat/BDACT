package com.example.bdact

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Registration5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registration5)

        val btnBack = findViewById<Button>(R.id.backButton)
        btnBack.setOnClickListener {
            val intent = Intent(this, Registration4::class.java)
            startActivity(intent)
        }
        val mail=findViewById<TextView>(R.id.email)
        val co=findViewById<TextView>(R.id.useCode)
        val btnNext = findViewById<Button>(R.id.nextButton)
        btnNext.setOnClickListener {

            val pla=mail.text.toString()
            val cd=co.text.toString()

            if ( pla.isEmpty()|| cd.isEmpty()) {
                Toast.makeText(this@Registration5, "Code doesn't match", Toast.LENGTH_LONG).show()

            }
            else {
            Toast.makeText(this@Registration5, "Verification confirmed", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Registration_pic::class.java)

            startActivity(intent)}
        }
    }
}