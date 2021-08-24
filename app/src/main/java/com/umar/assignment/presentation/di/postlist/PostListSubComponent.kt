package com.umar.assignment.presentation.di.postlist

import com.umar.assignment.presentation.postlist.MainActivity
import dagger.Subcomponent


@PostListScope
@Subcomponent(modules = [PostListModule::class])
interface PostListSubComponent {
    fun inject(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface  Factory{
        fun create() :PostListSubComponent
    }
}