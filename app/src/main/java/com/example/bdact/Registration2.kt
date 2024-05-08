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

class Registration2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registration2)
        val btnBack = findViewById<Button>(R.id.backButton)
        btnBack.setOnClickListener {
            val intent = Intent(this, Registration::class.java)
            startActivity(intent)
        }
        val nid=findViewById<TextView>(R.id.nidNumber)
        val pas=findViewById<TextView>(R.id.passportNumber)
        val btnNext = findViewById<Button>(R.id.nextButton)
        btnNext.setOnClickListener {
            val pla=nid.text.toString()
            val cd=pas.text.toString()

            if ( pla.isEmpty()|| cd.isEmpty()) {
                Toast.makeText(this@Registration2, "Please fill in all the fields.", Toast.LENGTH_LONG).show()

            }
            else {
                val intent = Intent(this, Registration3::class.java)
                startActivity(intent)

            }
        }
    }
}