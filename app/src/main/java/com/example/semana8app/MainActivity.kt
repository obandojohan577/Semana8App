package com.example.semana8app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAbout: Button = findViewById(R.id.btnAbout)
        val btnContact: Button = findViewById(R.id.btnContact)

        btnAbout.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }

        btnContact.setOnClickListener {
            val intent = Intent(this, ContactActivity::class.java)
            startActivity(intent)
        }
    }
}
