
package com.muhammadprajadinata.detikoffline.fragmnet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.muhammadprajadinata.detikoffline.R
import com.muhammadprajadinata.detikoffline.adapter.RvHomeNewsAdapter
import com.muhammadprajadinata.detikoffline.model.NewsHome
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private lateinit var newsHomeAdapter: RvHomeNewsAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val  linearManager = LinearLayoutManager(context)
        linearManager.orientation = LinearLayoutManager.VERTICAL
        rv_daftarBerita.layoutManager = linearManager

        newsHomeAdapter = RvHomeNewsAdapter(context!!, NewsHome.NewsModel.newList)
        rv_daftarBerita.adapter = newsHomeAdapter
    }
}