package com.anwaralfarhany.noteappmvvm.data.repository

import com.anwaralfarhany.noteappmvvm.data.Note
import com.anwaralfarhany.noteappmvvm.data.database.NoteDataBase

class NoteRepository {
    val dao = NoteDataBase.getInstanceWithoutContext().noteDao()

    suspend fun insertNewNote(note: Note){
        dao.insertNote(note)
    }

    suspend fun deleteNote(note: Note){
        dao.deleteNote(note)
    }

    suspend fun updateNote(note: Note){
        dao.updateNote(note)
    }

    suspend fun getAllNotes() = dao.getAllNotes()
}