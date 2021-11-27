package com.anwaralfarhany.noteappmvvm.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.anwaralfarhany.noteappmvvm.R
import com.anwaralfarhany.noteappmvvm.data.database.NoteDataBase
import com.anwaralfarhany.noteappmvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var _binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding= DataBindingUtil.setContentView(this, R.layout.activity_main)
        NoteDataBase.getInstance(applicationContext)
    }
}