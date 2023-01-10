package com.example.rivisionlab

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.rivisionlab.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.submit.setOnClickListener {

            var strName = binding.name.text.toString()
            var strEmail = binding.email.text.toString()

            when {
                strName.isBlank() -> Toast.makeText(this, "Enter a valid Name", Toast.LENGTH_SHORT)
                    .show()
                strEmail.isBlank() -> Toast.makeText(this,
                    "Enter a valid Email",
                    Toast.LENGTH_SHORT).show()
                else -> {
                    Intent(this, SecondActivity::class.java).also {
                        it.putExtra("Name", strName)
                        it.putExtra("Email", strEmail)
                        startActivity(it)
                    }

                }
            }

        }


    }
}