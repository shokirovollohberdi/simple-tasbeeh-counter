package com.example.tasbeh

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var support = supportActionBar
        support!!.title = "Tasbeh"
        tasbeh_Count()
    }

    fun tasbeh_Count() {
        val sharedPreferences = getSharedPreferences("nomi", MODE_PRIVATE)
        val edit = sharedPreferences.edit()

        var h: String = sharedPreferences.getString("key", zikr_number.text.toString()).toString()
        zikr_number.text = h

        tasbeeh_click.setOnClickListener {
            var a = zikr_number.text.toString().toInt() + 1
            edit.putString("key", a.toString())
            edit.commit()
            //yozish

            var h: String = sharedPreferences.getString("key", a.toString()).toString()
            zikr_number.text = h
            //oqish
        }
        restart.setOnClickListener {
            count = 0
            zikr_number.text = count.toString()
            edit.putString("key", count.toString())
            edit.commit()
            //yozish
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.baholash -> {
                var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/Muhammadali_Eshonqulov"))
                startActivity(intent)
            }
            R.id.haqida -> {
                var intent = Intent(this, dastur_haqida::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

}