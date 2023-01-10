package com.example.rivisionlab

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name = intent.extras?.getString("Name")
        val email = intent.extras?.getString("Email")

        val strName = findViewById<TextView>(R.id.strname)


        strName.text = "Hi $name , \n Your Email : $email is registered Successfully"



    }
}