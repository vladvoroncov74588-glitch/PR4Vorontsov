package com.example.pr4_vorontsov

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Находим все три элемента
        val myButton: Button = findViewById(R.id.button)
        val myImage: ImageView = findViewById(R.id.myImageView)
        val closeButton: Button = findViewById(R.id.buttonClose)

        // Клик по первой кнопке
        myButton.setOnClickListener {
            myButton.visibility = View.GONE
            myImage.visibility = View.VISIBLE
            closeButton.visibility = View.VISIBLE
        }

        // Клик по «Закрыть»
        closeButton.setOnClickListener {
            myImage.visibility = View.GONE
            closeButton.visibility = View.GONE
            myButton.visibility = View.VISIBLE
        }
    }
}