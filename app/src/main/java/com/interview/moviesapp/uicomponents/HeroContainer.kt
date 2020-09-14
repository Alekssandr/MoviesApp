package com.interview.moviesapp.uicomponents

import android.content.Context
import android.util.AttributeSet
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.interview.moviesapp.model.MovieItemModel

class HeroContainer @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : RecyclerView(context, attrs, defStyleAttr) {

    private var _adapter: LaneComponentAdapter = LaneComponentAdapter()

    init {
        PagerSnapHelper().attachToRecyclerView(this)
        layoutManager = ZoomRecyclerLayout(context)
        (layoutManager as ZoomRecyclerLayout).orientation = LinearLayoutManager.HORIZONTAL
        (layoutManager as ZoomRecyclerLayout).reverseLayout = true
        (layoutManager as ZoomRecyclerLayout).stackFromEnd = true
        adapter = _adapter

    }

    fun setData(list: List<MovieItemModel>?) = _adapter.updateList(list)
}


