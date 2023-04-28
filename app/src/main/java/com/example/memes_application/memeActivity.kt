package com.example.memes_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class memeActivity : AppCompatActivity() {
    lateinit var tvMemeE:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme)
        tvMemeE = findViewById(R.id.tvMemeE)
        tvMemeE.setOnClickListener{
            val intent=Intent(this,MainActivity:: class.java)
            startActivity(intent)
        }
    }
}