package com.yuna.selfgrowthapp.di

import android.content.Context
import com.yuna.selfgrowthapp.common.AppLogger
import com.yuna.selfgrowthapp.data.repository.SessionRepositoryImpl
import com.yuna.selfgrowthapp.domain.repository.ISessionRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideSessionRepository(@ApplicationContext context: Context): ISessionRepository {
        AppLogger.d( message = "ISessionRepository Object created")
        return SessionRepositoryImpl(context)
    }
}