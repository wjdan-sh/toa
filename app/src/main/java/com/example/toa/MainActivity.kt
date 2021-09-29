package com.example.toa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var name: EditText
        lateinit var email: EditText
        lateinit var toa: Button
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name = findViewById(R.id.Name)
        email = findViewById(R.id.email)
        toa = findViewById(R.id.toa)

        toa.setOnClickListener{
            val str = "${name.text.toString() +" " + email.text.toString()}"

            Toast.makeText(applicationContext, str,Toast.LENGTH_SHORT).show()
        }

    }
}