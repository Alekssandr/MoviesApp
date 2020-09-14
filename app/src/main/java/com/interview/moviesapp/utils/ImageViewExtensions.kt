package com.interview.moviesapp.utils

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.MultiTransformation
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions

@BindingAdapter("imgUrl")
fun ImageView.loadBy(url: String?) {
    url?.let {
        loadImage(it)
    }
}

fun ImageView.loadImage(
    url: String,
    scaling: BitmapTransformation = CenterCrop(),
    @DrawableRes placeholder: Int? = null,
    roundingRadius: Int = 0,
    listener: RequestListener<Drawable>? = null,
    contentDescription: String? = null
) {
    this.contentDescription = contentDescription
    val transformations = mutableListOf(scaling)

    if (roundingRadius > 0)
        transformations.add(RoundedCorners(roundingRadius))

    Glide.with(context)
        .load(url)
        .apply(
            RequestOptions().transform(
                MultiTransformation(transformations)
            )
        )
        .also {
            if (placeholder != null)
                it.placeholder(placeholder)

            if (listener != null)
                it.listener(listener)
        }
        .into(this)
}
