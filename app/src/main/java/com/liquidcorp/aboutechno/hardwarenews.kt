package com.liquidcorp.aboutechno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.hardware_news.*


class hardwarenews : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hardware_news)

        crd0.setOnClickListener {
            startActivity(Intent(applicationContext, news1::class.java))
        }
    }
}
