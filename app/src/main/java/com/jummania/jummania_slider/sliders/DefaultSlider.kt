package com.jummania.jummania_slider.sliders

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.jummania.JSlider
import com.jummania.jummania_slider.R

class DefaultSlider : JSlider.DefaultSlider() {
    override fun getView(layoutInflater: LayoutInflater, parent: ViewGroup): View {
        return layoutInflater.inflate(R.layout.item_slider2, parent, false) //Inflate you layout
    }

    override fun onSliderCreate(view: View, position: Int) {

        /*
        val textView: TextView = view.findViewById(R.id.text_view) //find your child
        val imageView: ImageView = view.findViewById(R.id.image_view)
        Picasso.get()
            .load("https://jummania.com/App/BanglaNatokSamahar/Images/Cover%20Photo.jpg")
            .error(R.drawable.default_error).placeholder(R.drawable.default_loading)
            .into(imageView)

            textView.text = getString(R.string.Developer_Name)

         */

        view.setOnClickListener {
            val context = it.context
            Toast.makeText(
                context,
                "Developer Name: ${context.getString(R.string.Developer_Name)}\nItem Position: $position",
                Toast.LENGTH_SHORT
            ).show()
        }


    }

    override fun getCount(): Int {
        return 3
    }

}