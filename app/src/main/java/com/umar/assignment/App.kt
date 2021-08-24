package com.umar.assignment

import android.app.Application
import com.umar.assignment.presentation.di.*
import com.umar.assignment.presentation.di.core.*
import com.umar.assignment.presentation.di.postdetail.PostDetailSubComponent
import com.umar.assignment.presentation.di.postlist.PostListSubComponent

class App : Application() , Injector {
    private  lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.BASE_URL))
            .build()
    }

    override fun createPostListSubComponent(): PostListSubComponent {
        return appComponent.postListSubComponent().create()
    }

    override fun createPostDetailSubComponent(): PostDetailSubComponent {
        return appComponent.postDetailSubComponent().create()
    }
}