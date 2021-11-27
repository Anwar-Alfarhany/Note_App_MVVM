package com.anwaralfarhany.noteappmvvm.ui.base

import androidx.recyclerview.widget.DiffUtil

class NoteDiffUtils<T>(
    private val notesOldList: List<T>,
    private val notesNewList: List<T>,
    private val checkIfSameItem: (oldItem: T, newItem: T) -> Boolean
) : DiffUtil.Callback() {
    override fun getOldListSize() = notesOldList.size

    override fun getNewListSize() = notesNewList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int) =
        notesOldList[oldItemPosition] == notesNewList[newItemPosition]

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int) = true
}