package ru.asmelnikov.android.notes_app.data

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.asmelnikov.android.notes_app.domain.model.Note
import ru.asmelnikov.android.notes_app.domain.repository.NoteRepository

@Database(entities = [Note::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun noteDao(): NoteRepository
}