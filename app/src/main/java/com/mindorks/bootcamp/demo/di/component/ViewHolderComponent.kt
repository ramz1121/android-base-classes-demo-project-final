package com.mindorks.bootcamp.demo.di.component

import com.mindorks.bootcamp.demo.di.module.FragmentModule
import com.mindorks.bootcamp.demo.di.FragmentScope
import com.mindorks.bootcamp.demo.di.ViewHolderScope
import com.mindorks.bootcamp.demo.di.module.ViewHolderModule
import com.mindorks.bootcamp.demo.ui.home.HomeFragment
import com.mindorks.bootcamp.demo.ui.home.post.PostViewHolder

import dagger.Component

@ViewHolderScope
@Component(dependencies = [ApplicationComponent::class], modules = [ViewHolderModule::class])
interface ViewHolderComponent {

fun inject(viewHolder: PostViewHolder)
}
