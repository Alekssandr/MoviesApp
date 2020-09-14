package com.interview.moviesapp.uicomponents

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.ViewCompat
import androidx.core.view.updateLayoutParams
import androidx.core.view.updatePadding
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import androidx.transition.ChangeBounds
import androidx.transition.ChangeImageTransform
import androidx.transition.ChangeTransform
import androidx.transition.Transition
import com.bumptech.glide.Glide
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.interview.moviesapp.R
import com.interview.moviesapp.utils.*
import kotlinx.android.synthetic.main.detail_fragment.view.*
import java.util.concurrent.TimeUnit


class DetailFragment : Fragment() {

    companion object {
        const val TRANSITION_NAME_BACKGROUND = "background"
    }

    private val args: DetailFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedElementEnterTransition = createSharedElementTransition(LARGE_EXPAND_DURATION)
        sharedElementReturnTransition = createSharedElementTransition(LARGE_COLLAPSE_DURATION)
    }

    private fun createSharedElementTransition(duration: Long): Transition {
        return transitionTogether {
            this.duration = duration
            interpolator = FAST_OUT_SLOW_IN
            this += ChangeImageTransform()
            this += ChangeBounds()
            this += ChangeTransform()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity).supportActionBar?.hide()
        return inflater.inflate(R.layout.detail_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        postponeEnterTransition(500L, TimeUnit.MILLISECONDS)

        val toolbar: Toolbar = view.findViewById(R.id.toolbar)
        val image: ImageView = view.findViewById(R.id.image)
        val content: LinearLayout = view.findViewById(R.id.content)
        val coordinator: CoordinatorLayout = view.findViewById(R.id.detail)

        view.name.text = args.title

        args.url
        ViewCompat.setTransitionName(coordinator, TRANSITION_NAME_BACKGROUND)

        ViewCompat.setOnApplyWindowInsetsListener(view) { _, insets ->
            toolbar.updateLayoutParams<CollapsingToolbarLayout.LayoutParams> {
                topMargin = insets.systemWindowInsetTop
            }
            content.updatePadding(
                left = insets.systemWindowInsetLeft,
                right = insets.systemWindowInsetRight,
                bottom = insets.systemWindowInsetBottom
            )
            insets
        }

        Glide
            .with(image)
            .load(args.url)
            .dontTransform()
            .doOnEnd(this::startPostponedEnterTransition)
            .into(image)

        toolbar.setNavigationOnClickListener {
            Navigation.findNavController(it).popBackStack()
        }
    }
}
