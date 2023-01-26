package ru.asmelnikov.android.notes_app.domain.usecases

import ru.asmelnikov.android.notes_app.data.NoteRepositoryImpl
import javax.inject.Inject

class GetAllNotesUseCase @Inject constructor(
    private val noteRepository: NoteRepositoryImpl
) {
    suspend operator fun invoke() = noteRepository.getAllNotes()
}