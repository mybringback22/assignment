package com.umar.assignment.presentation.postlist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.umar.assignment.domain.usecase.GetPostsUseCase
import com.umar.assignment.domain.usecase.UpdatePostsUseCase

class PostListViewModel(
    private val getPostsUseCase: GetPostsUseCase,
    private val updatePostsUseCase: UpdatePostsUseCase
) : ViewModel() {
    fun getPosts() = liveData {
        val posts  = getPostsUseCase.execute()
        emit(posts)
    }


    fun updatePosts() = liveData {
       val posts =  updatePostsUseCase.execute()
        emit(posts)
    }
}