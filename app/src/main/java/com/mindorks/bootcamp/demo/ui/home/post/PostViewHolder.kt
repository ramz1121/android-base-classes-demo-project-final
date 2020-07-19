package com.mindorks.bootcamp.demo.ui.home.post

import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import androidx.lifecycle.Observer
import com.mindorks.bootcamp.demo.R
import com.mindorks.bootcamp.demo.di.component.ViewHolderComponent
import com.mindorks.bootcamp.demo.ui.base.BaseItemViewHolder
import kotlinx.android.synthetic.main.item_view_post.view.*

class PostViewHolder(
        parent: ViewGroup
) : BaseItemViewHolder<Post, PostViewModel>(
        R.layout.item_view_post, parent
) {
    override fun injectDependencies(viewHolderComponent: ViewHolderComponent) {
        viewHolderComponent.inject(this)
    }

    override fun setupView(view: View) {
        //later
    }

    override fun setupObservers() {
        super.setupObservers()
        viewModel.data.observe(this, Observer {
            itemView.tv_message.text=it.text
        })
        itemView.setOnClickListener{
            showMessage("$adapterPosition clicked")
        }
    }
}