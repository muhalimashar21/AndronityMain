package com.example.tpq.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tpq.R
import com.example.tpq.activity.KehadiranActivity
import com.example.tpq.activity.KelasActivity
import com.example.tpq.activity.MuridActivity
import com.example.tpq.activity.PenilaianActivity
import kotlinx.android.synthetic.main.fragment_beranda.*


class BerandaFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_beranda, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnMurid.setOnClickListener {
            val intent = Intent(activity, MuridActivity::class.java)
            startActivity(intent)
        }
        btnKelas.setOnClickListener {
            val intent = Intent(activity, KelasActivity::class.java)
            startActivity(intent)
        }
        btnkehadiran.setOnClickListener {
            val intent = Intent(activity, KehadiranActivity::class.java)
            startActivity(intent)
        }
        btnPenilaian.setOnClickListener {
            val intent = Intent(activity, PenilaianActivity::class.java)
            startActivity(intent)
        }

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}
