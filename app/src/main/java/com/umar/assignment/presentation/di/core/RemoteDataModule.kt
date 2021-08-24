package com.umar.assignment.presentation.di.core

import com.umar.assignment.data.api.PostService
import com.umar.assignment.data.repository.post.datasource.PostRemoteDataSource
import com.umar.assignment.data.repository.post.datasourceimpl.PostRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule {

    @Singleton
    @Provides
    fun providePostDataSource(postService: PostService):PostRemoteDataSource{
        return PostRemoteDataSourceImpl(postService)
    }
}