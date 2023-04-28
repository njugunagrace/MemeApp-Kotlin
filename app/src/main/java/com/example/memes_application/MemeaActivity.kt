package com.example.memes_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MemeaActivity : AppCompatActivity() {
    lateinit var tvPreviousA:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memea)
        tvPreviousA=findViewById(R.id.tvPreviousA)
        tvPreviousA.setOnClickListener {
            val intent = Intent(this,memeBActivity::class.java)
            startActivity(intent)
        }
    }
}