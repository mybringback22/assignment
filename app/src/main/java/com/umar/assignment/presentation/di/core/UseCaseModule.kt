package com.umar.assignment.presentation.di.core

import com.umar.assignment.domain.repository.PostRepository
import com.umar.assignment.domain.usecase.GetPostByIdUseCase
import com.umar.assignment.domain.usecase.GetPostsUseCase
import com.umar.assignment.domain.usecase.UpdatePostsUseCase
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {
    @Provides
    fun provideGetPostsUseCase(postRepository: PostRepository) : GetPostsUseCase{
        return GetPostsUseCase(postRepository)
    }


    @Provides
    fun provideUpdatePostsUseCase(postRepository: PostRepository) : UpdatePostsUseCase{
        return UpdatePostsUseCase(postRepository)
    }


    @Provides
    fun provideGetPostByIdUseCase(postRepository: PostRepository) : GetPostByIdUseCase{
        return  GetPostByIdUseCase(postRepository)
    }
}