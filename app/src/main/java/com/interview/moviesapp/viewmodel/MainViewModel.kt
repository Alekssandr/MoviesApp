package com.interview.moviesapp.viewmodel

import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.interview.moviesapp.model.MovieItemModel
import com.interview.moviesapp.repo.MovieRepository

class MainViewModel(
    movieRepository: MovieRepository
) : ViewModel(), LifecycleObserver {

    val heroList: MutableLiveData<List<MovieItemModel>> = MutableLiveData()
    val featureList: MutableLiveData<List<MovieItemModel>> = MutableLiveData()
    val newList: MutableLiveData<List<MovieItemModel>> = MutableLiveData()

    init {
        heroList.value = movieRepository.getHero()
        featureList.value = movieRepository.getFeature()
        newList.value = movieRepository.getNew()
    }


}

