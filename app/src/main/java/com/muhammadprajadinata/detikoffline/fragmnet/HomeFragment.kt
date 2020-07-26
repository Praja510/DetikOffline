
package com.muhammadprajadinata.detikoffline.fragmnet

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.muhammadprajadinata.detikoffline.DetailNews
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

        var headlineNews: NewsHome? = null
        if (NewsHome.NewsModel.newList.isNotEmpty()) {
            headlineNews = NewsHome.NewsModel.newList[NewsHome.NewsModel.newList.size-2]
            tv_newsHeadlines.text = headlineNews.title
            tv_descHeadlines.text = headlineNews.desc
            img_news0.setImageResource(headlineNews.photo)
        }

        cdv_newsheadline.setOnClickListener {
            val intent = Intent(context, DetailNews::class.java).apply {
                putExtra(DetailNews.contentDetailBerita, headlineNews?.desc)
                putExtra(DetailNews.judulDetailBerita, headlineNews?.title)
                putExtra(DetailNews.photoDetailBerita, headlineNews?.photo.toString())
            }

            startActivity(intent)
        }

        val  linearManager = LinearLayoutManager(context)
        linearManager.orientation = LinearLayoutManager.VERTICAL
        rv_daftarBerita.layoutManager = linearManager

        newsHomeAdapter = RvHomeNewsAdapter(context!!, NewsHome.NewsModel.newList)
        rv_daftarBerita.adapter = newsHomeAdapter
    }
}