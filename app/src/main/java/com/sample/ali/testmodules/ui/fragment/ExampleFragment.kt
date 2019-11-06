package com.sample.ali.testmodules.ui.fragment

import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.sample.ali.testmodules.R
import dagger.android.DaggerFragment
import kotlinx.android.synthetic.main.fragment_example.view.*
import javax.inject.Inject

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class ExampleFragment : DaggerFragment() {

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_example, container, false)

        v.etName.setText(sharedPreferences.getString("savedName", "").toString())

        v.bUpdate.setOnClickListener(View.OnClickListener {
            with(sharedPreferences.edit()) {
                putString("savedName", v.etName.text.toString())
                commit()
            }
        })

        return v
    }

}
