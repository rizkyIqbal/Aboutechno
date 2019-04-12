package com.liquidcorp.aboutechno


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.html_menu.*


class htmlmenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.html_menu)

        crd0.setOnClickListener{
            startActivity(Intent(applicationContext, htmltutorial1::class.java))
        }

        crd1.setOnClickListener{
            startActivity(Intent(applicationContext, htmltutorial2::class.java))
        }

    }
}

