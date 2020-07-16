package com.mindorks.bootcamp.demo.di.module

import android.content.Context

import com.mindorks.bootcamp.demo.MyApplication
import com.mindorks.bootcamp.demo.di.ApplicationContext
import com.mindorks.bootcamp.demo.di.DatabaseInfo
import com.mindorks.bootcamp.demo.di.NetworkInfo

import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable

@Module
class ApplicationModule(private val application: MyApplication) {

    @ApplicationContext
    @Provides
    fun provideContext(): Context = application

    @Provides
    @DatabaseInfo
    fun provideDatabaseName(): String = "dummy_db"

    @Provides
    @DatabaseInfo
    fun provideDatabaseVersion(): Int = 1

    @Provides
    @NetworkInfo
    fun provideApiKey(): String = "SOME_API_KEY"

    @Provides
    fun provideCompositeDisposable(): CompositeDisposable = CompositeDisposable()
}
