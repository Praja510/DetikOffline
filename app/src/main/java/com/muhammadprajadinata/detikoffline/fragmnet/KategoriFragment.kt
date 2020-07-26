package com.muhammadprajadinata.detikoffline.fragmnet

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.muhammadprajadinata.detikoffline.R
import com.muhammadprajadinata.detikoffline.kategori.NewsSportActivity
import kotlinx.android.synthetic.main.fragment_kategori.*

class KategoriFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_kategori, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnItemSport.setOnClickListener {
            val intentSport = Intent(context, NewsSportActivity::class.java)
            startActivity(intentSport)
        }
    }
}