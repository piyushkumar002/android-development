package com.example.sozo_v2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)

    // code for going back to home activity
        val btnHome = findViewById<Button>(R.id.btnHome)

        btnHome.setOnClickListener {
            Toast.makeText(applicationContext, "opening home activity", Toast.LENGTH_SHORT).show()
            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }


    }
}