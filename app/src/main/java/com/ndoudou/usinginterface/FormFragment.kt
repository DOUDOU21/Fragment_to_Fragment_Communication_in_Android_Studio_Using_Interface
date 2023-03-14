package com.ndoudou.usinginterface

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.ndoudou.usinginterface.model.User


class FormFragment : Fragment() {
    private lateinit var communicator: Communicator
    lateinit var mNomEditText : EditText
    lateinit var mPrenomEditText : EditText
    lateinit var mEmailEditText : EditText
    lateinit var mValiderButton : Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = layoutInflater.inflate(R.layout.fragment_form, container, false)

        communicator = activity as Communicator

        mNomEditText = view.findViewById<EditText>(R.id.edit_text_nom)
        mPrenomEditText = view.findViewById<EditText>(R.id.edit_text_prenom)
        mEmailEditText = view.findViewById<EditText>(R.id.edit_text_email)
        mValiderButton = view.findViewById<Button>(R.id.button_valider)


        mValiderButton.setOnClickListener {
            communicator.passDataCom(user = User(mNomEditText.text.toString(),mPrenomEditText.text.toString(),mEmailEditText.text.toString()))
        }

        return view
    }

}