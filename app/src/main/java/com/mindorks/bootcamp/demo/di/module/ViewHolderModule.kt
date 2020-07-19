package com.mindorks.bootcamp.demo.di.module

import android.content.Context
import androidx.lifecycle.LifecycleRegistry
import androidx.lifecycle.ViewModelProviders
import com.mindorks.bootcamp.demo.data.local.DatabaseService
import com.mindorks.bootcamp.demo.data.remote.NetworkService
import com.mindorks.bootcamp.demo.di.ActivityContext
import com.mindorks.bootcamp.demo.ui.base.BaseFragment
import com.mindorks.bootcamp.demo.ui.base.BaseItemViewHolder
import com.mindorks.bootcamp.demo.ui.home.HomeViewModel
import com.mindorks.bootcamp.demo.utils.NetworkHelper
import com.mindorks.bootcamp.demo.utils.ViewModelProviderFactory
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable

@Module
class ViewHolderModule(private val viewHolder:BaseItemViewHolder<*,*>) {

    @Provides
    fun provideLifecycleRegistry(): LifecycleRegistry = LifecycleRegistry(viewHolder)
}
