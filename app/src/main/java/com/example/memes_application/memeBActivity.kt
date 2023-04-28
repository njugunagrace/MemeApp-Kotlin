package com.example.memes_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class memeBActivity : AppCompatActivity() {
    lateinit var tvNextB:TextView
    lateinit var tvPreviousB:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_b)
        tvNextB=findViewById(R.id.tvNextB)
        tvNextB.setOnClickListener {
            val intent= Intent(this,MemeaActivity::class.java)
            startActivity(intent)
        }
        tvPreviousB=findViewById(R.id.tvPreviousB)
        tvPreviousB.setOnClickListener {
            val intent= Intent(this,memeCActivity::class.java)
            startActivity(intent)
        }
    }
}