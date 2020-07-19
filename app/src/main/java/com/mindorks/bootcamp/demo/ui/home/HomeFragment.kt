package com.mindorks.bootcamp.demo.ui.home

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.mindorks.bootcamp.demo.R
import com.mindorks.bootcamp.demo.di.component.FragmentComponent
import com.mindorks.bootcamp.demo.ui.base.BaseFragment
import com.mindorks.bootcamp.demo.ui.home.post.PostAdapter
import kotlinx.android.synthetic.main.fragment_home.*
import javax.inject.Inject

class HomeFragment : BaseFragment<HomeViewModel>() {

    companion object {

        val TAG = "HomeFragment"

        fun newInstance(): HomeFragment {
            val args = Bundle()
            val fragment = HomeFragment()
            fragment.arguments = args
            return fragment
        }
    }

    @Inject
    lateinit var linearLayoutManager: LinearLayoutManager

    @Inject
    lateinit var postAdapter: PostAdapter

    override fun provideLayoutId(): Int = R.layout.fragment_home

    override fun injectDependencies(fragmentComponent: FragmentComponent) =
            fragmentComponent.inject(this)

    override fun setupView(view: View) {
        rv_posts.apply {
            adapter = postAdapter
            layoutManager = linearLayoutManager
        }
    }

    override fun setupObservers() {
        super.setupObservers()
        viewModel.testData.observe(this, Observer {
            postAdapter.appendData(it)
        })
    }
}
