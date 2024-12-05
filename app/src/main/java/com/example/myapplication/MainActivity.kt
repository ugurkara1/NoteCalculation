package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var vizenot = findViewById<EditText>(R.id.vizeInput)
        var fınalnot=findViewById<EditText>(R.id.finInput)
        var buton = findViewById<Button>(R.id.button)
        var goster = findViewById<TextView>(R.id.sonucGoster)

        //vize.text.toString().toInt()

        buton.setOnClickListener{
            val vize=vizenot.text.toString().toInt()
            val fın=fınalnot.text.toString().toInt()

            val sonuc=(vize*0.4) + (fın* 0.6)
            goster.text=sonuc.toString()

        }

    }
}