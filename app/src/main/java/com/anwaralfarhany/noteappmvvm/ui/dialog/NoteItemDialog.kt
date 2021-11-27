package com.anwaralfarhany.noteappmvvm.ui.dialog

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatDialog
import com.anwaralfarhany.noteappmvvm.data.Note
import com.anwaralfarhany.noteappmvvm.databinding.DialogAddNoteItemBinding

class NoteItemDialog(context: Context, var dialogListener: DialogListener) :
    AppCompatDialog(context) {
    private lateinit var binding: DialogAddNoteItemBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setDataToNote()
    }

    private fun setDataToNote() {
        binding.addBtn.setOnClickListener {
            val title = binding.title.text
            val description = binding.description.text

            if (title?.isEmpty() ?: description?.isEmpty() == true) {
                Toast.makeText(context,
                    "Please enter title and description for the note",
                    Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val item = Note(0,title.toString(), description.toString())
            dialogListener.onAddButtonClicked(item)
            dismiss()
        }
    }
}