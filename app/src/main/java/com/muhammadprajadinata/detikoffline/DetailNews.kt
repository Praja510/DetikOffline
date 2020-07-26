package com.muhammadprajadinata.detikoffline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_news.*

class DetailNews : AppCompatActivity() {

    companion object {
        const val judulDetailBerita = "Berita Detail Berita"
        const val contentDetailBerita = "Content Detail Berita"
        const val photoDetailBerita = "Image Detail Berita"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_news)

        txt_TitleNews.text = intent.getStringExtra(judulDetailBerita)
        txt_kontenNews.text = intent.getStringExtra(contentDetailBerita)
        img_toolbar.setImageResource(intent.getStringExtra(photoDetailBerita).toInt())

    }
}