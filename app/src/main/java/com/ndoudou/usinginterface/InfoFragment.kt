package com.ndoudou.usinginterface

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.ndoudou.usinginterface.model.User

class InfoFragment : Fragment() {
    private lateinit var communicator: Communicator
    lateinit var nomTextView : TextView
    lateinit var prenomTextView : TextView
    lateinit var emailTextView : TextView
    lateinit var shareButton : Button


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = layoutInflater.inflate(R.layout.fragment_info, container, false)

        communicator = activity as Communicator
        init(view)

        val user = arguments?.getSerializable("user") as? User
        if (user != null) {
            displayData(user)
        }

        return view
    }

    fun init(view : View){
        nomTextView = view.findViewById<TextView>(R.id.text_view_nom)
        prenomTextView = view.findViewById<TextView>(R.id.text_view_prenom)
        emailTextView = view.findViewById<TextView>(R.id.text_view_email)
        shareButton = view.findViewById<Button>(R.id.button_share)
    }
    fun displayData(user : User){
        nomTextView.text = user.nom
        prenomTextView.text = user.prenom
        emailTextView.text = user.email
    }

}