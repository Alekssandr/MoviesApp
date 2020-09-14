package com.interview.moviesapp.utils

import androidx.transition.Transition
import androidx.transition.TransitionSet

inline fun transitionTogether(crossinline body: TransitionSet.() -> Unit): TransitionSet {
    return TransitionSet().apply {
        ordering = TransitionSet.ORDERING_TOGETHER
        body()
    }
}

operator fun TransitionSet.plusAssign(transition: Transition) {
    addTransition(transition)
}
