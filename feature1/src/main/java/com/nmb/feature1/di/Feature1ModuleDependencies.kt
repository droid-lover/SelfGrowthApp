package com.nmb.feature1.di

import android.content.Context
import com.nmb.feature1.data.repository.SessionRepositoryImpl
import com.nmb.feature1.domain.repository.ISessionRepository
import com.nmb.logging.AppLogger
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class Feature1ModuleDependencies {
    @Provides
    @Singleton
    fun provideSessionRepository(@ApplicationContext context: Context): ISessionRepository {
        AppLogger.d( message = "ISessionRepository Object created")
        return SessionRepositoryImpl(context)
    }
    
    
}