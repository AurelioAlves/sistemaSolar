package com.example.sistemasolar.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sistemasolar.R
import com.example.sistemasolar.model.Planet

class PlanetAdapter(private val planets: List<Planet>) :
        RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder>() {

    private var listener: OnPlanetItemListener? = null

    class PlanetViewHolder(view: View, listener: OnPlanetItemListener?) : RecyclerView.ViewHolder(view) {
        val iName: TextView = view.findViewById(R.id.planet_item_textview_name)
        val iPicture: ImageView = view.findViewById(R.id.planet_item_image)

        init {
            view.setOnClickListener {
                listener?.onClick( it, adapterPosition )
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.planet_item, parent, false)

        return PlanetViewHolder(view, listener)
    }

    override fun onBindViewHolder(holder: PlanetViewHolder, position: Int) {
        holder.iName.text = planets[position].name
        holder.iPicture.setImageResource(planets[position].id)
    }

    override fun getItemCount(): Int {
        return planets.size
    }

    fun setOnPlanetItemListener(listener: OnPlanetItemListener) {
        this.listener = listener
    }

}