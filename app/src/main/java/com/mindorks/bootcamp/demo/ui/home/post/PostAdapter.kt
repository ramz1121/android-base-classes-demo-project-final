package com.mindorks.bootcamp.demo.ui.home.post

import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import com.mindorks.bootcamp.demo.ui.base.BaseAdapter

class PostAdapter (
        parentLifecycle: Lifecycle,
        postList: ArrayList<Post>
): BaseAdapter<Post,PostViewHolder>(parentLifecycle,postList) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)=PostViewHolder(parent)
}