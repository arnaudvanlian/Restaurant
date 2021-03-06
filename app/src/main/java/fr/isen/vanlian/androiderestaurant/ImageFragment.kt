package fr.isen.vanlian.androiderestaurant


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.squareup.picasso.Picasso
import fr.isen.vanlian.androiderestaurant.databinding.FragmentImageBinding


class ImageFragment(var url :String?) : Fragment() {
    private lateinit var binding : FragmentImageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding = FragmentImageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view,savedInstanceState)
        if(!url.isNullOrEmpty())
            Picasso.get().load(url).error(R.drawable.plat).into(binding.imageFrag)
        else
            binding.imageFrag.setImageResource(R.drawable.plat)
        activity?.findViewById<ImageView>(R.id.imageFrag)

    }
}