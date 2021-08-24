package com.umar.assignment.presentation.di.postdetail

import com.umar.assignment.presentation.postdetail.PostDetailActivity
import com.umar.assignment.presentation.postlist.MainActivity
import dagger.Subcomponent

@PostDetailScope
@Subcomponent(modules = [PostDetailModule::class])
interface PostDetailSubComponent {
    fun inject(postDetailActivity: PostDetailActivity)

    @Subcomponent.Factory
    interface  Factory{
        fun create() :PostDetailSubComponent
    }
}