package com.anwaralfarhany.noteappmvvm.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.anwaralfarhany.noteappmvvm.data.Note

@Database(entities = [Note::class], version = 1)
abstract class NoteDataBase : RoomDatabase() {
    abstract fun noteDao(): NoteDao

    companion object {
        private const val NOTE_DATABASE = "noteDataBase"

        @Volatile
        private var instance: NoteDataBase? = null

        fun getInstance(context: Context): NoteDataBase {
            return instance ?: synchronized(this) { buildDataBase(context).also { instance = it } }
        }

        fun getInstanceWithoutContext(): NoteDataBase {
            return instance!!
        }

        private fun buildDataBase(context: Context): NoteDataBase {
            return Room.databaseBuilder(context, NoteDataBase::class.java, NOTE_DATABASE).build()
        }
    }
}