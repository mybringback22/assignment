package com.umar.assignment.presentation.postlist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.umar.assignment.domain.usecase.GetPostsUseCase
import com.umar.assignment.domain.usecase.UpdatePostsUseCase

class PostListViewModelFactory(
    private val getPostsUseCase: GetPostsUseCase,
    private val updatePostsUseCase: UpdatePostsUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return PostListViewModel(getPostsUseCase ,updatePostsUseCase ) as T
    }
}