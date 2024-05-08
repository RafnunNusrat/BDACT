package com.example.bdact

import android.annotation.SuppressLint
import android.text.InputFilter
import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.text.SpannableStringBuilder
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Registration3 : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registration3)

        val  prsent= findViewById<EditText>(R.id.presentAddress)
            prsent.autoConvertToUpperCase()

        val  parma= findViewById<EditText>(R.id.permanentAddress)
            parma.autoConvertToUpperCase()


        val btnBack = findViewById<Button>(R.id.backButton)
        btnBack.setOnClickListener {
            val intent = Intent(this, Registration2::class.java)
            startActivity(intent)
        }
        val btnNext = findViewById<Button>(R.id.nextButton)
        btnNext.setOnClickListener {
            val pla=prsent.text.toString()
            val cd=parma.text.toString()

            if ( pla.isEmpty()|| cd.isEmpty()) {
                Toast.makeText(this@Registration3, "Please fill in all the fields.", Toast.LENGTH_LONG).show()

            }
            else {
                val intent = Intent(this, Registration4::class.java)
                startActivity(intent)

            }
        }
    }

    private fun EditText.autoConvertToUpperCase() {
        inputType = InputType.TYPE_TEXT_FLAG_CAP_CHARACTERS
        filters = arrayOf(InputFilter { source, _, _, _, _, _ ->
            if (source is CharSequence) {
                val builder = SpannableStringBuilder()
                for (element in source) {
                    builder.append(element.toUpperCase())
                }
                builder
            } else {
                null
            }
        })
    }
}