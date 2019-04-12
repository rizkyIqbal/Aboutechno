package com.liquidcorp.aboutechno



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.html_tutorial2.*


class htmltutorial2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.html_tutorial2)

        bckbtn.setOnClickListener{
            startActivity(Intent(applicationContext, htmltutorial1::class.java))
        }
    }
}

