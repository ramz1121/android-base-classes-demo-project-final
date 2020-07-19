package com.mindorks.bootcamp.demo.ui.home

import androidx.lifecycle.MutableLiveData
import com.mindorks.bootcamp.demo.data.local.DatabaseService
import com.mindorks.bootcamp.demo.data.remote.NetworkService
import com.mindorks.bootcamp.demo.ui.base.BaseViewModel
import com.mindorks.bootcamp.demo.ui.home.post.Post
import com.mindorks.bootcamp.demo.utils.NetworkHelper
import io.reactivex.disposables.CompositeDisposable

class HomeViewModel constructor(
        compositeDisposable: CompositeDisposable,
        networkHelper: NetworkHelper,
        private val databaseService: DatabaseService,
        private val networkService: NetworkService)
    : BaseViewModel(compositeDisposable, networkHelper) {

    val testData = MutableLiveData<List<Post>>()

    override fun onCreate() {
        testData.postValue(listOf(
                Post("test1"),
                        Post("test2"),
                        Post("test3"),
                        Post("test4"),
                        Post("test5"),
                        Post("test6"),
                        Post("test7")
        ))
    }
}
