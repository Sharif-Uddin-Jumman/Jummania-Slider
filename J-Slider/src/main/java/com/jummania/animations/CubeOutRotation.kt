package com.jummania.animations

import android.view.View
import androidx.viewpager.widget.ViewPager
import kotlin.math.abs

/**
 * Created by Jummania on 17,November,2023.
 * Email: sharifuddinjumman@gmail.com
 * Dhaka, Bangladesh.
 */
class CubeOutRotation : ViewPager.PageTransformer {
    override fun transformPage(page: View, position: Float) {
        if (position < -1)     // [-Infinity,-1)
        // This page is way off-screen to the left.
            page.alpha = 0f
        else if (position <= 0) {    // [-1,0]
            page.alpha = 1f
            page.pivotX = page.width.toFloat()
            page.rotationY = -90 * abs(position)
        } else if (position <= 1) {    // (0,1]
            page.alpha = 1f
            page.pivotX = 0f
            page.rotationY = 90 * abs(position)
        } else     // (1,+Infinity]
        // This page is way off-screen to the right.
            page.alpha = 0f

    }
}