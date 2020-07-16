package com.mindorks.bootcamp.demo.ui.main

import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import com.mindorks.bootcamp.demo.R
import com.mindorks.bootcamp.demo.di.component.ActivityComponent
import com.mindorks.bootcamp.demo.ui.base.BaseActivity
import com.mindorks.bootcamp.demo.ui.home.HomeFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<MainViewModel>() {

    override fun provideLayoutId(): Int = R.layout.activity_main

    override fun injectDependencies(activityComponent: ActivityComponent) = activityComponent.inject(this)

    override fun setupView(savedInstanceState: Bundle?) {
        addHomeFragment()
    }

    override fun setupObservers() {
        super.setupObservers()
        viewModel.testData.observe(this, Observer {
            tv_message.text = it
        })
    }

    private fun addHomeFragment() {
        if (supportFragmentManager.findFragmentByTag(HomeFragment.TAG) == null) {
            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.container_fragment, HomeFragment.newInstance(), HomeFragment.TAG)
                    .commit()
        }
    }
}
