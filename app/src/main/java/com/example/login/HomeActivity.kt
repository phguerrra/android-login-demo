package com.example.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home)

        val btnTelaLinear = findViewById<Button>(R.id.btnTelaLinear)
        val btnTelaRelative = findViewById<Button>(R.id.btnTelaRelative)
        val btnTelaTable = findViewById<Button>(R.id.btnTelaTable)
        val btnTelaConstraint = findViewById<Button>(R.id.btnTelaConstraint)

        btnTelaLinear.setOnClickListener {
            val intent = Intent(this, LinearActivity::class.java)

            startActivity(intent)
        }

        btnTelaRelative.setOnClickListener {
            val intent = Intent(this, RelativeActivity::class.java)

            startActivity(intent)
        }

        btnTelaTable.setOnClickListener {
            val intent = Intent(this, TableActivity::class.java)

            startActivity(intent)
        }

        btnTelaConstraint.setOnClickListener {
            val intent = Intent(this, ConstraintActivity::class.java)

            startActivity(intent)
        }
    }
}
