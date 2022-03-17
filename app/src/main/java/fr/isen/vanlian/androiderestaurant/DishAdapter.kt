package fr.isen.vanlian.androiderestaurant

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DishAdapter(private val menu : ArrayList<String>): RecyclerView.Adapter<DishAdapter.DishHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DishHolder {
        val inflatedView = LayoutInflater.from(parent.context)
            .inflate(R.layout.dish_cell, parent,false)
        return DishHolder(inflatedView)
    }

    override fun onBindViewHolder(holder: DishHolder, position: Int) {
        val dishMeal = menu[position]
        val itemDescription = holder.view.findViewById<TextView>(R.id.nameDish)
        itemDescription.text = dishMeal
    }

    override fun getItemCount(): Int {
        return menu.size
    }


    class DishHolder(v: View) : RecyclerView.ViewHolder(v)  {
        public var view: View = v
    }
}
