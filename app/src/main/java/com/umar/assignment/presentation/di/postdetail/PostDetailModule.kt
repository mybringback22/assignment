package com.umar.assignment.presentation.di.postdetail

import com.umar.assignment.domain.usecase.GetPostByIdUseCase
import com.umar.assignment.presentation.postdetail.PostDetailModelViewFactory
import dagger.Module
import dagger.Provides

@Module
class PostDetailModule {
    @PostDetailScope
    @Provides
    fun providePostDetailModelViewFactory(getPostByIdUseCase: GetPostByIdUseCase) : PostDetailModelViewFactory{
        return PostDetailModelViewFactory(getPostByIdUseCase)
    }
}