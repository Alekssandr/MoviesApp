package com.interview.moviesapp.uicomponents

import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.interview.moviesapp.R
import com.interview.moviesapp.base.ViewModelFactory
import com.interview.moviesapp.databinding.HomeFragmentBinding
import com.interview.moviesapp.lifecircle.observeLifecycleIn
import com.interview.moviesapp.repo.MovieRepository
import com.interview.moviesapp.viewmodel.MainViewModel

class HomeFragment : Fragment() {

    private lateinit var mainViewModel: MainViewModel
    private lateinit var binding: HomeFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         binding  =
            DataBindingUtil.inflate(inflater, R.layout.home_fragment, container, false)
        setupViewModel()
        (activity as AppCompatActivity).supportActionBar?.show()
        return binding.root
    }

    private fun setupViewModel() {
        mainViewModel = ViewModelProviders.of(
            this,
            ViewModelFactory(
                MovieRepository()
            )
        ).get(MainViewModel::class.java)
        binding.viewModel = mainViewModel
        binding.lifecycleOwner = this@HomeFragment
        observeLifecycleIn(mainViewModel)

    }
}