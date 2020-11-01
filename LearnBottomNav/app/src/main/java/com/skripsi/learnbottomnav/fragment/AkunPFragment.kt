package com.example.tpq.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tpq.R
import com.example.tpq.activity.LoginActivity
import com.example.tpq.activity.MuridActivity
import com.example.tpq.activity.SessionManager
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.fragment_akun.*
import kotlinx.android.synthetic.main.fragment_beranda.*

class AkunPFragment : Fragment() {
    var sessionManager: SessionManager? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_akun, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val session = SessionManager(this.requireContext())

        btnLogout.setOnClickListener{
            session!!.logoutUser()}

        var nama =session.getNama()
        tvusername.text = nama
        var username =session.getUsername()
        tvnama.text = username
        var password =session.getPassword()
        tvpassword.text = password
        var telepon =session.getTelepon()
        tvtelepon.text = telepon
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

}
