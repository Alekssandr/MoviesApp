package com.interview.moviesapp.utils

import android.animation.TimeInterpolator
import androidx.core.view.animation.PathInterpolatorCompat

val FAST_OUT_SLOW_IN: TimeInterpolator by lazy(LazyThreadSafetyMode.NONE) {
    PathInterpolatorCompat.create(0.4f, 0f, 0.2f, 1f)
}

