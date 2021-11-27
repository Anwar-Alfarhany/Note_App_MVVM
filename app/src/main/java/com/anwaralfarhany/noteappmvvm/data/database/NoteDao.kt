package com.anwaralfarhany.noteappmvvm.data.database

import androidx.room.*
import com.anwaralfarhany.noteappmvvm.data.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {
    @Insert
    suspend fun insertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)

    @Update
    suspend fun updateNote(note: Note)

    @Query("SELECT * from NOTE_TABLE ORDER BY id DESC" )
    fun getAllNotes() : Flow<List<Note>>
}