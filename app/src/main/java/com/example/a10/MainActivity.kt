package com.example.a10

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var editText1 : EditText
    private lateinit var button1 : Button
    private lateinit var textView1 : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets}
        editText1 = findViewById(R.id.editTextText)
        textView1 = findViewById(R.id.textView3)
        button1 = findViewById(R.id.button)
        button1.setOnClickListener()
        {
            val numberInput: Double = editText1.text.toString().toDouble()
            if (numberInput < -1)
            {
                val numberInput1: Double = numberInput + 2
                textView1.text = numberInput1.toString()
            }
            else if(numberInput >= -1 && numberInput <= 2)
            {
                val numberInput1: Double = numberInput * numberInput
                textView1.text = numberInput1.toString()
            }
            else
            {
                val numberInput1: Double = 5 - numberInput
                textView1.text = numberInput1.toString()
            }
        }


        }
    }
