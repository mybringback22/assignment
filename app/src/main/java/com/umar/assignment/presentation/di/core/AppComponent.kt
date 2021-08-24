package com.umar.assignment.presentation.di.core

import com.umar.assignment.presentation.di.postdetail.PostDetailSubComponent
import com.umar.assignment.presentation.di.postlist.PostListSubComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        DatabaseModule::class,
        LocalDataModule::class,
        RemoteDataModule::class,
        RepositoryModule::class,
        UseCaseModule::class,
        NetModule::class
    ]
)
interface AppComponent {
    fun postListSubComponent () : PostListSubComponent.Factory
    fun postDetailSubComponent() : PostDetailSubComponent.Factory
}