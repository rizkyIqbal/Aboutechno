package com.liquidcorp.aboutechno


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.hardware_news.*
import kotlinx.android.synthetic.main.main_menu.*


class codingmenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.coding_menu)

        crd1.setOnClickListener{
            startActivity(Intent(applicationContext, htmlmenu::class.java))
        }

    }
}

