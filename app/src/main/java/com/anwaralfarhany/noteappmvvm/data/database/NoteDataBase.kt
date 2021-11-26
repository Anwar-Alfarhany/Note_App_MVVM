package com.anwaralfarhany.noteappmvvm.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.anwaralfarhany.noteappmvvm.data.Note

@Database(entities = [Note::class], version = 1)
abstract class NoteDataBase : RoomDatabase() {
    abstract fun noteDao(): NoteDao
}