package com.umar.assignment.presentation.di.core

import com.umar.assignment.presentation.di.postdetail.PostDetailSubComponent
import com.umar.assignment.presentation.di.postlist.PostListSubComponent

interface Injector {
    fun createPostListSubComponent() : PostListSubComponent
    fun createPostDetailSubComponent() : PostDetailSubComponent
}