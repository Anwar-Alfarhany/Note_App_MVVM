package com.anwaralfarhany.noteappmvvm.ui.dialog

import com.anwaralfarhany.noteappmvvm.data.Note


interface DialogListener {
    fun onAddButtonClicked(item: Note)
}