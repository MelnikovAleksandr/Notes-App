package ru.asmelnikov.android.notes_app.data

import ru.asmelnikov.android.notes_app.domain.model.Note
import ru.asmelnikov.android.notes_app.domain.repository.NoteRepository
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(
    private val noteRepositoryImpl: NoteRepository
) {
    suspend fun getAllNotes(): List<Note> = noteRepositoryImpl.getAllNotes()
    suspend fun insertNote(note: Note) = noteRepositoryImpl.insertNote(note = note)
    suspend fun deleteNote(note: Note) = noteRepositoryImpl.deleteNote(note = note)
    suspend fun getNoteById(id: Long) = noteRepositoryImpl.getNoteById(noteId = id)

}