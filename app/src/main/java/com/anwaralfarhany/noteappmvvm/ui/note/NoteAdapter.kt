package com.anwaralfarhany.noteappmvvm.ui.note

import com.anwaralfarhany.noteappmvvm.R
import com.anwaralfarhany.noteappmvvm.data.Note
import com.anwaralfarhany.noteappmvvm.ui.base.BaseAdapter
import com.anwaralfarhany.noteappmvvm.ui.base.BaseInteractionListener

class NoteAdapter(
    items: List<Note>,
    listener: NoteInteractionListener
) : BaseAdapter<Note>(items, listener) {
    override val layoutId: Int = R.layout.item_note
}

interface NoteInteractionListener :BaseInteractionListener