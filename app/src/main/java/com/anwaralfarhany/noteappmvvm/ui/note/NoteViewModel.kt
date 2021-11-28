package com.anwaralfarhany.noteappmvvm.ui.note

import androidx.lifecycle.*
import com.anwaralfarhany.noteappmvvm.data.Note
import com.anwaralfarhany.noteappmvvm.data.repository.NoteRepository
import kotlinx.coroutines.launch

class NoteViewModel : ViewModel(), NoteInteractionListener {
    private val repository = NoteRepository()
    private val noteTitle = MutableLiveData<String>()
    private val noteDescription = MutableLiveData<String>()
    val notes: LiveData<List<Note>> = repository.getAllNotes().asLiveData()

    fun addNewNote() {
        viewModelScope.launch {

        }
    }
}