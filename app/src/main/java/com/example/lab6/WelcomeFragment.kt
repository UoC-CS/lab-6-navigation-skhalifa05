package com.example.lab6

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


class WelcomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnSignIn = view.findViewById<Button>(R.id.btnSignIn)
        val btnSignUp = view.findViewById<Button>(R.id.btnSignUp)
        btnSignIn.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_signInFragment)
        }

        btnSignUp.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_signUpFragment)
        }
    }
}