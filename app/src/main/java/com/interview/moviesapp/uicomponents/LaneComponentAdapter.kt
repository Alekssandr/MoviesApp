package com.interview.moviesapp.uicomponents

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.view.ViewCompat
import androidx.dynamicanimation.animation.SpringAnimation
import androidx.dynamicanimation.animation.SpringForce
import androidx.navigation.findNavController
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.recyclerview.widget.RecyclerView
import com.interview.moviesapp.R
import com.interview.moviesapp.model.MovieItemModel
import com.interview.moviesapp.utils.loadBy
import kotlinx.android.synthetic.main.hero_item.view.*

class LaneComponentAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var heroList: MutableList<MovieItemModel> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.movie_feature_item, parent, false)
        when (viewType) {
            LaneViewType.HERO_LANE.ordinal -> {
                view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.hero_item, parent, false)
            }
            LaneViewType.NEW_LANE.ordinal -> {
                view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.content_item, parent, false)
            }
        }
        return HeroViewHolder(view)
    }

    override fun getItemCount(): Int {
        return heroList.size
    }

    override fun getItemViewType(position: Int): Int {
        heroList[position].type?.let {
            return when (it) {
                "HERO" -> LaneViewType.HERO_LANE.ordinal
                "NEW" -> LaneViewType.NEW_LANE.ordinal
                else -> LaneViewType.FEATURE_LANE.ordinal
            }
        }
    }

    fun updateList(list: List<MovieItemModel>?) {
        list?.let {
            heroList.clear()
            heroList.addAll(it)
            notifyDataSetChanged()
        }
    }

    class HeroViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        var currentVelocity = 0f

        private val backgroundImage = itemView.findViewById(R.id.backgroundImage) as ImageView

        fun bind(movieItemModel: MovieItemModel) {
            backgroundImage.loadBy(movieItemModel.backgroundImageUrl)
        }

        val rotation: SpringAnimation = SpringAnimation(itemView, SpringAnimation.TRANSLATION_X)
            .setSpring(
                SpringForce()
                    .setFinalPosition(0f)
                    .setDampingRatio(SpringForce.DAMPING_RATIO_HIGH_BOUNCY)
                    .setStiffness(SpringForce.STIFFNESS_LOW)
            )
            .addUpdateListener { _, _, velocity ->
                currentVelocity = velocity
            }
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val a = (holder as HeroViewHolder)
        a.bind(heroList[position])

        ViewCompat.setTransitionName(holder.itemView.card, "card-${heroList[position].hashCode()}")
        holder.itemView.setOnClickListener {

            it.findNavController().navigate(
                R.id.detailFragment,
                DetailFragmentArgs(heroList[position].backgroundImageUrl, heroList[position].titleText).toBundle(),
                null,
                FragmentNavigatorExtras(
                    holder.itemView.card to DetailFragment.TRANSITION_NAME_BACKGROUND
                )
            )
        }
    }

    val onScrollListener = object : RecyclerView.OnScrollListener() {
        override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
            recyclerView.forEachVisibleHolder { holder: HeroViewHolder ->
                holder.rotation
                    .setStartVelocity(holder.currentVelocity - dx * SCROLL_MAGNITUDE)
                    .start()
            }
        }
    }
}

private inline fun <reified T : RecyclerView.ViewHolder> RecyclerView.forEachVisibleHolder(
    action: (T) -> Unit
) {
    for (i in 0 until childCount) {
        action(getChildViewHolder(getChildAt(i)) as T)
    }
}

const val SCROLL_MAGNITUDE = 2f

enum class LaneViewType {
    HERO_LANE,
    NEW_LANE,
    FEATURE_LANE
}