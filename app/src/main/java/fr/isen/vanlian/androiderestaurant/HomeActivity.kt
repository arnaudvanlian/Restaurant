package fr.isen.vanlian.androiderestaurant

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlin.coroutines.coroutineContext

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mButtonStarter : Button = findViewById<Button>(R.id.entrées)
        val mButtonDish : Button = findViewById<Button>(R.id.plats)
        val mButtonDessert : Button = findViewById<Button>(R.id.desserts)

        mButtonStarter.setOnClickListener {
            chooseCatergory(getString(R.string.home_starters))
        }
        mButtonDish.setOnClickListener {
            chooseCatergory(getString(R.string.home_dish))
        }
        mButtonDessert.setOnClickListener {
            chooseCatergory(getString(R.string.home_desert))
        }


    }

    override fun onStop(){
        super.onStop()
        Log.d("HomeActivity","L'activité est arrêtée")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("HomeActivity","L'activité est dértuite")
    }
    private fun chooseCatergory(string: String) {
        val intent = Intent(this, DishActivity::class.java)
        intent.putExtra(CATEGORY_KEY,string)
        startActivity(intent)
    }
    companion object{
        const val CATEGORY_KEY = "category"
    }


}

