package com.example.firstemptyactivity

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonNext = findViewById<Button>(R.id.btnNext)
        val buttonPrev= findViewById<Button>(R.id.btnPrevious)

        buttonNext.setOnClickListener {
            Toast.makeText(applicationContext, "Hi ^-^\" there!!", Toast.LENGTH_SHORT).show()
        }

        buttonPrev.setOnClickListener {
            Toast.makeText(applicationContext, "This app is created by yours truly ^w^", Toast.LENGTH_LONG).show()
        }




    }
}