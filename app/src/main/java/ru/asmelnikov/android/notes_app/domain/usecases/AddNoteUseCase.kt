package ru.asmelnikov.android.notes_app.domain.usecases

import ru.asmelnikov.android.notes_app.data.NoteRepositoryImpl
import ru.asmelnikov.android.notes_app.domain.model.Note
import javax.inject.Inject

class AddNoteUseCase @Inject constructor(
    private val noteRepository: NoteRepositoryImpl
) {
    suspend operator fun invoke(note: Note) = noteRepository.insertNote(note = note)
}