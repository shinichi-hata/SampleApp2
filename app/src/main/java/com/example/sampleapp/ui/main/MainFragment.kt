package com.example.sampleapp.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.sampleapp.R
import com.example.sampleapp.databinding.MainFragmentBinding


class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        // ViewModelとDataBinding作成
        val viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        val binding = DataBindingUtil.
            inflate<MainFragmentBinding>(inflater, R.layout.main_fragment, container, false)

        // ViewModelとDataBindingを紐づけ
        binding.mainViewModel = viewModel

        // ライフサイクル所有者を設定
        binding.lifecycleOwner = this

        return binding.root
    }
}
