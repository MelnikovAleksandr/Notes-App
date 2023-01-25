package ru.asmelnikov.android.notes_app.domain.repository

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import ru.asmelnikov.android.notes_app.domain.model.Note

@Dao
interface NoteRepository {
    @Insert
    suspend fun insertNote(note: Note)

    @Query("SELECT * FROM note")
    suspend fun getAllNotes(): List<Note>

    @Delete
    suspend fun deleteNote(note: Note)

    @Query("SELECT * FROM note WHERE id=:noteId")
    suspend fun getNoteById(noteId: Long): Note
}