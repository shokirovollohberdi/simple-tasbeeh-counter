package com.example.tasbeh

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dastur_haqida.*
import kotlin.system.exitProcess

class dastur_haqida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dastur_haqida)

        val actionBar = supportActionBar

        actionBar!!.title = "Dastur Haqida"
        actionBar?.setDisplayShowTitleEnabled(true)


        boglanish.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/shokirov_ollohberdi"))
            startActivity(intent)
        }
    }
}