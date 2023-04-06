package com.example.exam

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var edtname: EditText
    private lateinit var edtemail: EditText
    private lateinit var edtPassword: EditText
    private lateinit var edtPhone: EditText
    private lateinit var btnRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtname = findViewById(R.id.edt_name)
        edtemail = findViewById(R.id.edt_email)
        edtPassword = findViewById(R.id.edt_password)
        edtPhone = findViewById(R.id.edt_phone)
        btnRegister = findViewById(R.id.btn_register)


        btnRegister.setOnClickListener {
            val username = edtname.text.toString()
            val email = edtname.text.toString()
            val password = edtname.text.toString()
            val phone = edtname.text.toString()

            if (username.isEmpty() || email.isEmpty() || password.isEmpty() || phone.isEmpty()) {
                Toast.makeText(applicationContext,
                    "Please fill all fields",
                    Toast.LENGTH_SHORT).show()

            }  else {
                val sharedPreferences = getSharedPreferences("myPrefs", Context.MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString("name", username)
                editor.apply()

                val intent = Intent(applicationContext, SecondActivity::class.java)
                startActivity(intent)
            }
        }
    }
}