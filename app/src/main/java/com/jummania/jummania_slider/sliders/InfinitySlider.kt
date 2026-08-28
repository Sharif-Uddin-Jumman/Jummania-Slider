package com.jummania.jummania_slider.sliders

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import coil3.load
import coil3.request.error
import coil3.request.placeholder
import com.jummania.JSlider
import com.jummania.jummania_slider.R

class InfinitySlider : JSlider.InfinitySlider() {
    override fun itemCount(): Int {
        return 3
    }

    override fun getView(layoutInflater: LayoutInflater, parent: ViewGroup): View {
        return layoutInflater.inflate(R.layout.item_slider2, parent, false) //Inflate you layout
    }

    override fun onSliderCreate(view: View, position: Int) {

        val textView: TextView = view.findViewById(R.id.text_view) //find your child
        val imageView: ImageView = view.findViewById(R.id.image_view)

        imageView.load("https://jummania.com/App/BanglaNatokSamahar/Images/Cover%20Photo.jpg") {
            placeholder(R.drawable.default_loading)
            error(R.drawable.default_error)
        }

        val context = view.context
        textView.text = context.getString(R.string.Developer_Name)

        view.setOnClickListener {
            Toast.makeText(
                context,
                context.getString(R.string.Developer_Name) + "\nItem Position: $position",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

}