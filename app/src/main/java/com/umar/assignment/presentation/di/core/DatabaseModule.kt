package com.umar.assignment.presentation.di.core

import android.content.Context
import androidx.room.Room
import com.umar.assignment.data.db.PostDAO
import com.umar.assignment.data.db.PostsDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun providePostDatabase(context : Context) : PostsDatabase{
        return Room.databaseBuilder(context , PostsDatabase::class.java , "postDataBase")
            .build()
    }

    @Singleton
    @Provides
    fun providePostDAO(postsDatabase: PostsDatabase):PostDAO{
        return  postsDatabase.postDAO()
    }
}