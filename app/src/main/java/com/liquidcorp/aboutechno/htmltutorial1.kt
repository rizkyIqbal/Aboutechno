package com.liquidcorp.aboutechno



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.html_tutorial1.*


class htmltutorial1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.html_tutorial1)

        nxtbtn.setOnClickListener{
            startActivity(Intent(applicationContext, htmltutorial2::class.java))
        }
    }
}

