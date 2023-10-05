package com.example.projectkelasc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClick1 = findViewById<Button>(R.id.btncons)
        buttonClick1.setOnClickListener {
            val intent = Intent(this, ConstrainLayout::class.java)
            startActivity(intent)
        }
        val buttonClick2 = findViewById<Button>(R.id.btnframe)
        buttonClick2.setOnClickListener {
            val intent = Intent(this, FrameLayout::class.java)
            startActivity(intent)
        }
        val buttonClick3 = findViewById<Button>(R.id.btnlinear)
        buttonClick3.setOnClickListener {
            val intent = Intent(this, LinearLayout::class.java)
            startActivity(intent)
        }
        val buttonClick4 = findViewById<Button>(R.id.btntable)
        buttonClick4.setOnClickListener {
            val intent = Intent(this, TableLayout::class.java)
            startActivity(intent)
        }


    }
}