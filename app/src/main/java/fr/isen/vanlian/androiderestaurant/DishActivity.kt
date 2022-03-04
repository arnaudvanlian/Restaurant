package fr.isen.vanlian.androiderestaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import fr.isen.vanlian.androiderestaurant.databinding.ActivityDishBinding

class DishActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDishBinding
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var adapter: DishAdapter
    private var dishlist : ArrayList<String> = ArrayList<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDishBinding.inflate(layoutInflater)
        setContentView(binding.root)
        dishlist.add("salade Cesar")
        dishlist.add("Corentin")
        dishlist.add("quiche")
        dishlist.add("chevre")

        binding.categoryname.text = intent.getStringExtra(HomeActivity.CATEGORY_KEY)

        val recyclerview = binding.categorylist
        linearLayoutManager = LinearLayoutManager(this)
        adapter = DishAdapter(dishlist)
        recyclerview.layoutManager = linearLayoutManager
        recyclerview.adapter = adapter



    }
}