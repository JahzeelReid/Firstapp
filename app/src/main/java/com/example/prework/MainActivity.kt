package com.example.prework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.hellobutton)
        button.setOnClickListener{
            Log.v("hello" , "bruh")
            Toast.makeText(this, "His name is Holo and he makes bombs", Toast.LENGTH_LONG).show()
        }
    }
}