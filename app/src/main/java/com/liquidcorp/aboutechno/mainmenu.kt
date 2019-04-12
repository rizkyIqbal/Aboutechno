package com.liquidcorp.aboutechno


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.main_menu.*


class mainmenu : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.main_menu)

            crd1.setOnClickListener{
                startActivity(Intent(applicationContext,hardwarenews::class.java))
            }

            crd2.setOnClickListener{
                startActivity(Intent(applicationContext,codingmenu::class.java))
            }

            crd3.setOnClickListener{
                startActivity(Intent(applicationContext,pilihkubu::class.java))
            }

            crd6.setOnClickListener{
                startActivity(Intent(applicationContext,credit::class.java))
            }

        }
    }

