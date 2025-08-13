package com.example.playlistmaker


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonPoisk = findViewById<Button>(R.id.btn_poisk)

        val buttonClickListener: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@MainActivity, SearchActivity::class.java)
                startActivity(intent)
            }
        }

        buttonPoisk.setOnClickListener(buttonClickListener)

        val buttonMediateka = findViewById<Button>(R.id.btn_mediateka)

        buttonMediateka.setOnClickListener {
            val intent = Intent(this@MainActivity, MedialibraryActivity::class.java)
            startActivity(intent)
        }

        val buttonNastroiki = findViewById<Button>(R.id.btn_nastroiki)

        buttonNastroiki.setOnClickListener {
            val intent = Intent(this@MainActivity, SettingsActivity::class.java)
            startActivity(intent)
        }

    }

}