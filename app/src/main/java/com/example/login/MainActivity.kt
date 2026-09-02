package com.example.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlin.jvm.java
import android.content.Intent
import android.widget.Button
import android.widget.Toast

class MainActivity :  AppCompatActivity (){

    private lateinit var btnEntrar: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        btnEntrar = findViewById(R.id.btnEntrar)

        btnEntrar.setOnClickListener {

            val intent = Intent(this, HomeActivity::class.java)

            startActivity(intent)
        }

    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()

        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()

        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()

        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()

        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()
    }
}