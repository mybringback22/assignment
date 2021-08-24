package com.umar.assignment.presentation.postdetail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.umar.assignment.domain.usecase.GetPostByIdUseCase
import com.umar.assignment.presentation.postlist.PostListViewModel

class PostDetailModelViewFactory(private  val getPostByIdUseCase: GetPostByIdUseCase) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return PostDetailViewModel(getPostByIdUseCase ) as T
    }
}