package ru.asmelnikov.android.notes_app.data

import ru.asmelnikov.android.notes_app.domain.model.Note
import ru.asmelnikov.android.notes_app.domain.repository.NoteRepository
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(
    private val noteRepository: NoteRepository
) {
    suspend fun getAllNotes(): List<Note> = noteRepository.getAllNotes()
    suspend fun insertNote(note: Note) = noteRepository.insertNote(note = note)
    suspend fun deleteNote(note: Note) = noteRepository.deleteNote(note = note)
    suspend fun getNoteById(id: Long) = noteRepository.getNoteById(noteId = id)

}