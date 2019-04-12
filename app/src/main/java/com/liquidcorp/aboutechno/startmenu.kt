package com.liquidcorp.aboutechno

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.start_menu.*

class startmenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_menu)

        btn1.setOnClickListener {
            startActivity(Intent(applicationContext, mainmenu::class.java))
        }
    }
}