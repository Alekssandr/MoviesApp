package com.interview.moviesapp.uicomponents

import android.content.Context
import android.util.AttributeSet
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.interview.moviesapp.model.MovieItemModel

class LaneContainer @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : RecyclerView(context, attrs, defStyleAttr) {

    private var _adapter: LaneComponentAdapter = LaneComponentAdapter()

    init {
        layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        adapter = _adapter
    }

    fun setData(list: List<MovieItemModel>?) = this.addOnScrollListener(
        _adapter.onScrollListener
    ).also { _adapter.updateList(list) }
}


