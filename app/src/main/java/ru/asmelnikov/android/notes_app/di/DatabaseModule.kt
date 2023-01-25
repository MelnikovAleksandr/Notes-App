package ru.asmelnikov.android.notes_app.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import ru.asmelnikov.android.notes_app.data.AppDatabase
import ru.asmelnikov.android.notes_app.domain.repository.NoteRepository

@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {

    @Provides
    fun provideAppDatabase(@ApplicationContext appContext: Context): AppDatabase {
        return Room.databaseBuilder(
            appContext,
            AppDatabase::class.java,
            "notes_database"
        ).build()
    }

    @Provides
    fun providesNoteDao(appDatabase: AppDatabase): NoteRepository {
        return appDatabase.noteDao()
    }
}