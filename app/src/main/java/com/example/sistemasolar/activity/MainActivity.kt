package com.example.sistemasolar.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sistemasolar.R
import com.example.sistemasolar.adapter.OnPlanetItemListener
import com.example.sistemasolar.adapter.PlanetAdapter
import com.example.sistemasolar.util.PlanetRepository

class MainActivity : AppCompatActivity(), OnPlanetItemListener {

    private lateinit var mList: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val planets = PlanetRepository.getAll()

        val planetAdapter = PlanetAdapter(planets)
        val llm = LinearLayoutManager( this )
        planetAdapter.setOnPlanetItemListener( this )

        mList = findViewById(R.id.main_recyclerview_list)

        mList.apply {
            adapter = planetAdapter
            layoutManager = llm
            hasFixedSize()
        }

    }

    override fun onClick(view: View, position: Int) {
        val it = Intent(this, DetailActivity::class.java)
        it.putExtra("position", position)
        startActivity(it)
    }

}