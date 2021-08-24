package com.umar.assignment.presentation.di.core
import com.umar.assignment.data.repository.post.PostRepositoryImpl
import com.umar.assignment.data.repository.post.datasource.PostLocalDataSource
import com.umar.assignment.data.repository.post.datasource.PostRemoteDataSource
import com.umar.assignment.domain.repository.PostRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun providePostRepository(
        postRemoteDataSource: PostRemoteDataSource,
        postLocalDataSource: PostLocalDataSource
    ): PostRepository {
        return PostRepositoryImpl(postRemoteDataSource , postLocalDataSource)
    }
}