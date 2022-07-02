package com.example.sayfagecisleri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sayfagecisleri.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonGitBir.setOnClickListener {
        val intent = Intent(this@MainActivity,SayfaBirActivity::class.java)
        startActivity(intent)
        }
        tasarim.buttonGitIki.setOnClickListener {
            val intent = Intent(this@MainActivity,SayfaIkiActivity::class.java)
            startActivity(intent)
        }
    }
}