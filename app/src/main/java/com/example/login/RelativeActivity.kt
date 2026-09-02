package com.example.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RelativeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.layout_relative)

        val btnSair = findViewById<Button>(R.id.btnSair)

        btnSair.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
            finish()
        }
    }
}
