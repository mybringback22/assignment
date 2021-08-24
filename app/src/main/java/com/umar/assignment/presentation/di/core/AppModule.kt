package com.umar.assignment.presentation.di.core

import android.content.Context
import com.umar.assignment.presentation.di.postlist.PostListSubComponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [PostListSubComponent::class])
class AppModule(private val context : Context) {
    @Singleton
    @Provides
    fun provideApplicationContext(): Context{
        return  context.applicationContext
    }
}