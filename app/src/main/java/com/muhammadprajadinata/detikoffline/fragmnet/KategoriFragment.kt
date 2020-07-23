package com.muhammadprajadinata.detikoffline.fragmnet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.muhammadprajadinata.detikoffline.R
import com.muhammadprajadinata.detikoffline.adapter.RvHomeNewsAdapter
import com.muhammadprajadinata.detikoffline.model.NewsHome
import kotlinx.android.synthetic.main.fragment_home.*

class KategoriFragment : Fragment() {
    private lateinit var newHomeAdapter: RvHomeNewsAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val lineManager = LinearLayoutManager(context)
        lineManager.orientation = LinearLayoutManager.VERTICAL
        rv_daftarBerita.layoutManager = lineManager

        newHomeAdapter = RvHomeNewsAdapter(context!!, NewsHome.NewsModel.newList)
        rv_daftarBerita.adapter = newHomeAdapter
    }
}