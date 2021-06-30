package com.example.sistemasolar.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.ImageView
import android.widget.TextView
import com.example.sistemasolar.R
import com.example.sistemasolar.util.PlanetRepository

class DetailActivity : AppCompatActivity() {

    private lateinit var mName: TextView
    private lateinit var mDescription: TextView
    private lateinit var mImage: ImageView
    private val planets = PlanetRepository.getAll()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        mName = findViewById(R.id.detail_textview_name)
        mDescription = findViewById(R.id.detail_textview_description)
        mImage = findViewById(R.id.detail_imageview_planet)

        val position = intent.getIntExtra("position", -1)

        mName.text = planets[position].name
        mDescription.text = planets[position].description
        mDescription.movementMethod = ScrollingMovementMethod()
        mImage.setImageResource(planets[position].id)

    }
}