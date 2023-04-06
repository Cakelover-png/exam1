package com.example.exam

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    private lateinit var btnadd: Button
    private lateinit var btnSkip: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btnadd=findViewById(R.id.btn_add)
        btnSkip=findViewById(R.id.btn_skip)
        val sharedPreferences = getSharedPreferences("myPrefs", Context.MODE_PRIVATE)
        val name = sharedPreferences.getString("name", "")
        Toast.makeText(applicationContext,"Welcome $name",Toast.LENGTH_SHORT).show()



        btnSkip.setOnClickListener{
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}