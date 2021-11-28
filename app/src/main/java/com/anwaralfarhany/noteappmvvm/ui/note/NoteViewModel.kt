package com.anwaralfarhany.noteappmvvm.ui.note

import androidx.lifecycle.*
import com.anwaralfarhany.noteappmvvm.data.Note
import com.anwaralfarhany.noteappmvvm.data.repository.NoteRepository
import kotlinx.coroutines.launch
import java.util.*

class NoteViewModel : ViewModel(), NoteInteractionListener {
    private val repository = NoteRepository()
    val noteTitle = MutableLiveData<String>()
    val noteDescription = MutableLiveData<String>()
    val notes: LiveData<List<Note>> = repository.getAllNotes().asLiveData()

    fun addNewNote() {
        viewModelScope.launch {
            noteTitle.value.let {
                repository.insertNewNote(Note(id = null,
                    title = it,
                    noteDescription.value,
                    Date()))
                noteTitle.postValue("")
                noteDescription.postValue("")
            }
        }
    }
}