package ru.asmelnikov.android.notes_app.presentation.screens.details

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import ru.asmelnikov.android.notes_app.domain.model.Note
import ru.asmelnikov.android.notes_app.domain.usecases.DeleteNoteUseCase
import ru.asmelnikov.android.notes_app.domain.usecases.GetNoteByIdUseCase
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(
    private val getNoteByIdUseCase: GetNoteByIdUseCase,
    private val deleteNoteUseCase: DeleteNoteUseCase
) : ViewModel() {
    private val _note = MutableLiveData<Note>()
    val note: LiveData<Note>
        get() = _note

    fun getNoteById(id: Long) {
        viewModelScope.launch {
            getNoteByIdUseCase.invoke(id = id).let {
                _note.postValue(it)
            }
        }
    }

    fun deleteNote(onSuccess: () -> Unit) {
        viewModelScope.launch {
            note.value?.let {
                deleteNoteUseCase.invoke(note = it)
                onSuccess()
            }
        }
    }
}