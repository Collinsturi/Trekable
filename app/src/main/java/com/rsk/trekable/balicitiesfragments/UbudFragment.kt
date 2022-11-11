package com.rsk.trekable.balicitiesfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.rsk.trekable.R
import com.rsk.trekable.databinding.FragmentUbudBinding


class UbudFragment : Fragment(R.layout.fragment_ubud) {
    private var binding: FragmentUbudBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentUbudBinding.bind(view)


    }

    companion object {
        var POSITION_ARG = "position_arg"

        @JvmStatic
        fun newInstance(position: Int) =UbudFragment().apply {
            arguments = Bundle().apply {
                putInt(POSITION_ARG, position)
            }
        }
    }
}