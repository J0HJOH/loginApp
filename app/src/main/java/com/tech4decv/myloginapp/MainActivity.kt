package com.tech4decv.myloginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var phoneNumber: EditText
    private lateinit var button : ImageButton
    private var phone =""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        phoneNumber= findViewById(R.id.phone)
        button = findViewById(R.id.button)
        phone = phoneNumber.text.toString()
        button.setOnClickListener {
            if(phone.isNullOrEmpty()){
                Toast.makeText(this,"Please input Phone number",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"Logged In",Toast.LENGTH_LONG).show()
            }
        }



    }
}