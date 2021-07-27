package com.example.tablayout6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_simple.*

class SimpleFragment(categoria: String) : Fragment() {
    val categoria: String = categoria

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        text_fragment.text = categoria

    }
    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_simple, container, false)
    }

    /*override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? =
        TextView(requireContext()).apply {
            text = arguments?.getString("text") ?: ""
        }
*/
/*    companion object {
        fun newInstance(s: String) = SimpleFragment(categoria = ).apply {
            arguments = Bundle().apply {
                putString("text", s)
            }
        }*/
}