package com.project.shoppingmall.di

import com.project.shoppingmall.remote.MainService
import com.project.shoppingmall.remote.repository.MainRepository
import com.project.shoppingmall.remote.repository.MainRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object MainRepositoryModule {
    @ViewModelScoped
    @Provides
    fun provideMainRepository(
        mainService: MainService
    ) : MainRepository = MainRepositoryImpl(mainService)
}