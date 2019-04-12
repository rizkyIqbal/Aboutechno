package com.liquidcorp.aboutechno

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.pilih_kubu.*


class pilihkubu :  AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pilih_kubu)

      intl.setOnClickListener{
          startActivity(Intent(applicationContext,rakitanintel::class.java))
     }
    }
}