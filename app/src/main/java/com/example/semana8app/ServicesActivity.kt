package com.example.semana8app

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ServicesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val btnBack: Button = findViewById(R.id.btnBack)
        btnBack.setOnClickListener { finish() }
    }
}
