package com.example.facebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logo.visibility = View.VISIBLE
        logo.animate().translationY(-750f)
            .scaleX(0.7f).scaleY(0.7f)
            .duration = 1000
        login.setOnClickListener {
            // progress.visibility = View.VISIBLE
            val intent = Intent(this,Home::class.java)
            startActivity(intent)
        }
    }
}