package ru.asmelnikov.android.notes_app.domain.usecases

import ru.asmelnikov.android.notes_app.data.NoteRepositoryImpl
import javax.inject.Inject

class GetNoteByIdUseCase @Inject constructor(
    private val noteRepositoryImpl: NoteRepositoryImpl
) {
    suspend operator fun invoke(id: Long) = noteRepositoryImpl.getNoteById(id = id)
}