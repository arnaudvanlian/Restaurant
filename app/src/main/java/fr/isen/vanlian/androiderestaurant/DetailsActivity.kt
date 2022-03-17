package fr.isen.vanlian.androiderestaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import fr.isen.vanlian.androiderestaurant.databinding.ActivityDetailsBinding
import fr.isen.vanlian.androiderestaurant.databinding.ActivityMainBinding


class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val intent = intent

        val item = intent.getSerializableExtra(MenuActivity.DETAILS_KEY) as Items
        binding.foodTitle.text = item.name_fr



        binding.detailsFood.text = item.ingredients.joinToString(", ", transform = { it.name_fr })
        if(item.images.isNotEmpty()){
            binding.viewSilder.adapter = DetailImagePager(this,item.images)}
        else
            binding.imageView3.setImageResource(R.drawable.plat)

        Log.i("image", item.images.toString())
        //binding.viewSilder.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        //binding.viewSilder.adapter = ViewAdapter(this,item.images)

    }
}