package com.example.memes_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvPrevious:TextView
    lateinit var tvNext:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvPrevious=findViewById(R.id.tvPrevious)
        tvPrevious.setOnClickListener{
            val intent=Intent(
                this,memeActivity::class.java)
            (startActivity(intent))
        }
        tvNext=findViewById(R.id.tvNext)
        tvNext.setOnClickListener {
            val intent=Intent(this,memeCActivity::class.java)
            (startActivity(intent))
        }

    }
}
