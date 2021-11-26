package com.anwaralfarhany.noteappmvvm

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels

class NoteFragment : BaseFragment<FragmentNoteBinding>(R.layout.fragment_note) {
    override val viewModel by activityViewModels<NoteViewModel>()
    override val bindingInflater: (LayoutInflater, Int, ViewGroup?, Boolean) -> FragmentNoteBinding =
        DataBindingUtil::inflate

    override fun setupView() {

    }
}