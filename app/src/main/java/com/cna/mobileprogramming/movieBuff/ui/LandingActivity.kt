package com.cna.mobileprogramming.movieBuff.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.cna.mobileprogramming.foodie.R

class LandingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)

        val allMoviesClick = findViewById<Button>(R.id.allMoviesButton)
        allMoviesClick.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val highRatedClick = findViewById<Button>(R.id.highRatedButton)
        highRatedClick.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val favoritesClick = findViewById<Button>(R.id.favoritesButton)
        favoritesClick.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val latestClick = findViewById<Button>(R.id.latestButton)
        latestClick.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}