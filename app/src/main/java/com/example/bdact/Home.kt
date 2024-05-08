package com.example.bdact

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class Home : AppCompatActivity() {

    lateinit var bottomNav : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)


        bottomNav = findViewById(R.id.bottomNavigationView) as BottomNavigationView
        bottomNav.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.home -> {
                    val intent = Intent(this, Home::class.java)
                    startActivity(intent)
                    true
                }
                R.id.message -> {
                    Toast.makeText(this@Home, "Call for any infomation", Toast.LENGTH_LONG).show()

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


        val btncourse = findViewById<ImageView>(R.id.course)
        btncourse.setOnClickListener {
            val intent = Intent(this, MainCourses::class.java)
            startActivity(intent)
        }
        val btnschedule = findViewById<ImageView>(R.id.schedule)
        btnschedule.setOnClickListener {
            val intent = Intent(this, MainCourseSchedule::class.java)
            startActivity(intent)
        }
        val btnmyco = findViewById<ImageView>(R.id.myCourses)
       btnmyco.setOnClickListener {
            val intent = Intent(this,My_courses::class.java)
            startActivity(intent)
        }

        val btnpay = findViewById<ImageView>(R.id.pay)
       btnpay.setOnClickListener {
            val intent = Intent(this,Payment::class.java)
            startActivity(intent)
        }







        }
}