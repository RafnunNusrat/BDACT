package com.example.bdact

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class Login : AppCompatActivity() {
   

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val btnBack = findViewById<Button>(R.id.backButton)
        btnBack.setOnClickListener {
            val intent = Intent(this, Open_page::class.java)
            startActivity(intent)
        }
        val mail=findViewById<TextView>(R.id.email)
        val co=findViewById<TextView>(R.id.passwordbtn)

        val buttonNavigate = findViewById<Button>(R.id.btnLogIn)
        buttonNavigate.setOnClickListener {


            
            val pla=mail.text.toString()
            val cd=co.text.toString()

            if ( pla.isEmpty()|| cd.isEmpty()) {
                Toast.makeText(this@Login, "Please fill in all the fields.", Toast.LENGTH_LONG).show()

            }
            else {

            val intent = Intent(this, Home::class.java)
            startActivity(intent)}
        }
    }
}