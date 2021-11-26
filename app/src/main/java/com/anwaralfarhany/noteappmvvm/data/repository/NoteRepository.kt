package com.anwaralfarhany.noteappmvvm.data.repository

import com.anwaralfarhany.noteappmvvm.data.Note
import com.anwaralfarhany.noteappmvvm.data.database.NoteDataBase

class NoteRepository {
    val dao = NoteDataBase.getInstanceWithoutContext()?.noteDao()

    fun insertNewNote(note: Note){
        dao?.insertNote(note)
    }

    fun deleteNote(note: Note){
        dao?.deletNote(note)
    }

    fun updateNote(note: Note){
        dao?.updateNote(note)
    }
}