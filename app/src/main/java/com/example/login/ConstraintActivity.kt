package com.example.login

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ConstraintActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.layout_constraint)

        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        btnVoltar.setOnClickListener {
            finish()
        }
    }
}
