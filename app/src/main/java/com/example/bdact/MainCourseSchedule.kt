package com.example.bdact

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainCourseSchedule : AppCompatActivity() {
    lateinit var bottomNav : BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_course_schedule)

        bottomNav = findViewById(R.id.bottomNavigationView) as BottomNavigationView
        bottomNav.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.home -> {
                    val intent = Intent(this, Home::class.java)
                    startActivity(intent)
                    true
                }
                R.id.message -> {
                    Toast.makeText(this@MainCourseSchedule, "Call for any infomation", Toast.LENGTH_LONG).show()

                    true
                }
                R.id.settings -> {
                    val intent = Intent(this, Profile::class.java)
                    startActivity(intent)
                    true
                }

                else -> { val intent = Intent(this, Home::class.java)
                    startActivity(intent)
                    true}
            }

        }

        val but = findViewById<Button>(R.id.btn147)
        but.setOnClickListener {
            val intent = Intent(this, sche::class.java)
            startActivity(intent)
        }


    }
}