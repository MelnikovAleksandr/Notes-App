package ru.asmelnikov.android.notes_app.data

import androidx.room.Database
import ru.asmelnikov.android.notes_app.domain.model.Note

@Database(entities = [Note::class], version = 1)
abstract class AppDatabase {
    abstract fun noteDao(): NoteRepositoryImpl
}