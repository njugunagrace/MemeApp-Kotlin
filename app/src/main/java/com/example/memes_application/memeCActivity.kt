package com.example.memes_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class memeCActivity : AppCompatActivity() {
    lateinit var tvPreviousC: TextView
    lateinit var tvNextC:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_c)
        tvPreviousC=findViewById(R.id.tvPreviousC)
        tvPreviousC.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            (startActivity(intent))
        }
        tvNextC=findViewById(R.id.tvNextC)
        tvNextC.setOnClickListener {
            val intent=Intent(this,memeBActivity::class.java)
            (startActivity(intent))
        }


    }
}