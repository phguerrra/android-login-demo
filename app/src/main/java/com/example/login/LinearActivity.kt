package com.example.login

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LinearActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.layout_linear)

        val btnVoltarLinear = findViewById<Button>(R.id.btnVoltarLinear)

        btnVoltarLinear.setOnClickListener {
            finish()
        }
    }
}
