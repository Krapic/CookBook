package com.rma.cookbook.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

/** Hilt modul za app-wide dependency-je.
Za sada ovdje registriramo samo IO dispatcher kao jednostavan primjer
kako se dependency daje kroz Hilt, a ne rucno kroz konstruktor iz Activity-ja.
Kasnije ovdje mogu doci repository implementacije, Retrofit, Firebase i slicno. */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    /** IO dispatcher koristimo za posao koji ne smije blokirati glavni thread, npr. mrezu, bazu ili citanje datoteka. */
    @Provides
    @Singleton
    fun provideIoDispatcher(): CoroutineDispatcher = Dispatchers.IO
}