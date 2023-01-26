package ru.asmelnikov.android.notes_app.presentation.screens.add

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import ru.asmelnikov.android.notes_app.domain.model.Note
import ru.asmelnikov.android.notes_app.domain.usecases.AddNoteUseCase
import javax.inject.Inject

@HiltViewModel
class AddViewModel @Inject constructor(
    private val addNoteUseCase: AddNoteUseCase
) : ViewModel() {

    fun addNote(note: Note, onSuccess: () -> Unit) {
        viewModelScope.launch {
            addNoteUseCase.invoke(note = note)
            onSuccess()
        }
    }

}