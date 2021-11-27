package com.anwaralfarhany.noteappmvvm.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "NOTE_TABLE")
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    @ColumnInfo(name= "Title")
    val title: String,
    @ColumnInfo(name= "Description")
    val description: String,
   // @ColumnInfo(name= "Date")
   // val date: String,
)
