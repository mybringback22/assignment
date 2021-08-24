package com.umar.assignment.presentation.di.core

import com.umar.assignment.data.db.PostDAO
import com.umar.assignment.data.repository.post.datasource.PostLocalDataSource
import com.umar.assignment.data.repository.post.datasourceimpl.PostLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun providePostLocalDataSource(postDAO: PostDAO):PostLocalDataSource{
        return  PostLocalDataSourceImpl(postDAO)
    }
}