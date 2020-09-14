package com.interview.moviesapp.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.interview.moviesapp.repo.MovieRepository
import com.interview.moviesapp.viewmodel.MainViewModel

class ViewModelFactory(private val movieRepository: MovieRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(movieRepository) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}

