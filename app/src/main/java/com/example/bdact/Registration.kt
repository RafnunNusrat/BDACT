package com.example.bdact


import android.text.InputFilter
import android.text.InputType
import android.text.SpannableStringBuilder
import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.content.Intent
import android.widget.Button
import java.util.*
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class Registration : AppCompatActivity() {


    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registration)

        val nametext = findViewById<EditText>(R.id.nameText)
        nametext.autoConvertToUpperCase()
        val fathername = findViewById<EditText>(R.id.fatherName)
        fathername.autoConvertToUpperCase()
        val mothername = findViewById<EditText>(R.id.motherName)
        mothername.autoConvertToUpperCase()

        val  place= findViewById<EditText>(R.id.placeOfBirth)
        place.autoConvertToUpperCase()

        val  cdc= findViewById<EditText>(R.id.cdcNumber)
           cdc .autoConvertToUpperCase()
        val editTextDate: EditText = this.findViewById(R.id.editTextDate)

        editTextDate.setOnClickListener {
            showDatePickerDialog(editTextDate)
        }
        val btnBack = findViewById<Button>(R.id.backButton)
        btnBack.setOnClickListener {
            val intent = Intent(this, Open_page::class.java)
            startActivity(intent)
        }
        val btnNext = findViewById<Button>(R.id.nextButton)
        btnNext.setOnClickListener {

            val name = nametext.text.toString()
            val fath = fathername.text.toString()
            val moth = mothername.text.toString()
            val pla=place.text.toString()
            val cd=cdc.text.toString()
            val datb=editTextDate.text.toString()
            if (name.isEmpty() || fath.isEmpty() || moth.isEmpty()|| pla.isEmpty()|| cd.isEmpty()|| datb.isEmpty()) {
                Toast.makeText(this@Registration, "Please fill in all the fields.", Toast.LENGTH_LONG).show()

            }
            else {
                val intent = Intent(this, Registration2::class.java)
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



    private fun showDatePickerDialog(editTextDate: EditText) {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            this,
            { _, selectedYear, selectedMonth, selectedDay ->
                val selectedDate = Calendar.getInstance()
                selectedDate.set(selectedYear, selectedMonth, selectedDay)
                val dateFormat = java.text.SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
                val formattedDate = dateFormat.format(selectedDate.time)
                editTextDate.setText(formattedDate)
            },
            year,
            month,
            day
        )
        datePickerDialog.show()
    }




}
