package com.example.sozo_v2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnActivity2 = findViewById<Button>(R.id.btnNext)


        btnActivity2.setOnClickListener {
                Toast.makeText(applicationContext, "opening new activity", Toast.LENGTH_SHORT).show()
                intent = Intent(applicationContext, SecondActivity::class.java)
                startActivity(intent)
            }

    }
}
