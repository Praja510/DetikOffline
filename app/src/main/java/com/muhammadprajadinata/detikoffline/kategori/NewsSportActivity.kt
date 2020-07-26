package com.muhammadprajadinata.detikoffline.kategori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.muhammadprajadinata.detikoffline.DetailNews
import com.muhammadprajadinata.detikoffline.R
import com.muhammadprajadinata.detikoffline.adapter.RvNewsSportAdapter
import com.muhammadprajadinata.detikoffline.model.NewsSport
import kotlinx.android.synthetic.main.activity_news_sport.*

class NewsSportActivity : AppCompatActivity() {

    private var newsSportAdapter: RvNewsSportAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_sport)

        var headlineNews: NewsSport? = null

        if (NewsSport.NewsModel.newList.isNotEmpty()) {
            headlineNews = NewsSport.NewsModel.newList[NewsSport.NewsModel.newList.size-1]
            tv_newsHeadlinesSpo .text = headlineNews.title
            tv_descHeadlinesSpo.text = headlineNews.desc
            img_newsHeadlinesSpo.setImageResource(headlineNews.photo)
        }

        cdv_newsheadlineSpo.setOnClickListener {
            val intentDetail = Intent(this, DetailNews::class.java)
            intentDetail.putExtra(DetailNews.judulDetailBerita, headlineNews?.title)
            intentDetail.putExtra(DetailNews.contentDetailBerita, headlineNews?.detail)
            intentDetail.putExtra(DetailNews.photoDetailBerita, headlineNews?.photo.toString())
            startActivity(intent)
        }

        val linearManager = LinearLayoutManager(this)
        linearManager.orientation = LinearLayoutManager.VERTICAL
        rv_daftarBeritaSpo.layoutManager = linearManager

        newsSportAdapter = RvNewsSportAdapter(this, NewsSport.NewsModel.newList)
        rv_daftarBeritaSpo.adapter = newsSportAdapter
    }
}