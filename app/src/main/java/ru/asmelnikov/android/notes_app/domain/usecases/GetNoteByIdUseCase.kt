package ru.asmelnikov.android.notes_app.domain.usecases

import ru.asmelnikov.android.notes_app.data.NoteRepositoryImpl
import javax.inject.Inject

class GetNoteByIdUseCase @Inject constructor(
    private val noteRepository: NoteRepositoryImpl
) {
    suspend operator fun invoke(id: Long) = noteRepository.getNoteById(id = id)
}