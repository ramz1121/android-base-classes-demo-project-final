package com.mindorks.bootcamp.demo.ui.main

import androidx.lifecycle.MutableLiveData
import com.mindorks.bootcamp.demo.data.local.DatabaseService
import com.mindorks.bootcamp.demo.data.remote.NetworkService
import com.mindorks.bootcamp.demo.ui.base.BaseViewModel
import com.mindorks.bootcamp.demo.utils.NetworkHelper
import io.reactivex.disposables.CompositeDisposable

class MainViewModel(
        compositeDisposable: CompositeDisposable,
        networkHelper: NetworkHelper,
        private val databaseService: DatabaseService,
        private val networkService: NetworkService)
    : BaseViewModel(compositeDisposable, networkHelper) {

    val testData = MutableLiveData<String>()

    override fun onCreate() {
        testData.postValue("Hello from MainViewModel")
    }
}
