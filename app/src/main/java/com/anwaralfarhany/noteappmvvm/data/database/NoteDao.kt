package com.anwaralfarhany.noteappmvvm.data.database

import androidx.room.*
import com.anwaralfarhany.noteappmvvm.data.Note

@Dao
interface NoteDao {
    @Insert
    fun insertNote(note: Note)

    @Delete
    fun deletNote(note: Note)

    @Update
    fun updateNote(note: Note)

    @Query("SELECT * from NOTE_TABLE" )
    fun getAllNotes()
}