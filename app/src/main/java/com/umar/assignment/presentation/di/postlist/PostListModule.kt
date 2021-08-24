package com.umar.assignment.presentation.di.postlist

import com.umar.assignment.presentation.postlist.PostListViewModelFactory
import com.umar.assignment.domain.usecase.GetPostsUseCase
import com.umar.assignment.domain.usecase.UpdatePostsUseCase
import dagger.Module
import dagger.Provides

@Module
class PostListModule {
    @PostListScope
    @Provides
    fun providePostListViewModelFactory(getPostsUseCase: GetPostsUseCase , updatePostsUseCase: UpdatePostsUseCase): PostListViewModelFactory {
        return PostListViewModelFactory(getPostsUseCase , updatePostsUseCase)
    }
}