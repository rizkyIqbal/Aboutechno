package com.liquidcorp.aboutechno


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.rakitan_intel.*


class rakitanintel : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rakitan_intel)

        ltsg.setOnClickListener{
            startActivity(Intent(applicationContext,intel1::class.java))
        }
    }
}

