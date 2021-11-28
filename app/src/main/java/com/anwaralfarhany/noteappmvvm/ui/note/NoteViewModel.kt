package com.anwaralfarhany.noteappmvvm.ui.note

import androidx.lifecycle.*
import com.anwaralfarhany.noteappmvvm.data.Note
import com.anwaralfarhany.noteappmvvm.data.repository.NoteRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import java.util.*

class NoteViewModel : ViewModel() {
    private val repository = NoteRepository()
    val noteTitle = MutableStateFlow(String())
    val noteDescription = MutableStateFlow(String())
    val notes = MutableStateFlow(listOf<Note>())

    init {
        showNotes()
    }

    fun addNewNote() {
        viewModelScope.launch {
            noteTitle.value.let {
                repository.insertNewNote(Note(id = null,
                    title = it,
                    noteDescription.value,
                    Date()))
                noteTitle.emit("")
                noteDescription.emit("")
            }
        }
    }

    fun showNotes(){
        viewModelScope.launch {
            repository.getAllNotes().collect {
                notes.emit(it)
            }
        }
    }
}