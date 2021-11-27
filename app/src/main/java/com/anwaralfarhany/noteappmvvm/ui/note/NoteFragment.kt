package com.anwaralfarhany.noteappmvvm.ui.note

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.anwaralfarhany.noteappmvvm.R
import com.anwaralfarhany.noteappmvvm.databinding.FragmentNoteBinding
import com.anwaralfarhany.noteappmvvm.ui.base.BaseFragment

class NoteFragment : BaseFragment<FragmentNoteBinding>(R.layout.fragment_note) {
    override val viewModel by activityViewModels<NoteViewModel>()
    override val bindingInflater: (LayoutInflater, Int, ViewGroup?, Boolean) -> FragmentNoteBinding =
        DataBindingUtil::inflate

    override fun setupView() {

        binding.apply {
            viewModel = viewModel
            noteRecycler.adapter = NoteAdapter(mutableListOf(), viewModel)
        }
    }
}