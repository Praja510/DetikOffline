package com.muhammadprajadinata.detikoffline.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muhammadprajadinata.detikoffline.DetailNews
import com.muhammadprajadinata.detikoffline.R
import com.muhammadprajadinata.detikoffline.model.NewsSport
import kotlinx.android.synthetic.main.list_berita.view.*

class RvNewsSportAdapter(val context: Context, private val listNews: List<NewsSport>): RecyclerView.Adapter<NewsSportViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsSportViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_berita, parent, false)
        return NewsSportViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listNews.size
    }

    override fun onBindViewHolder(holder: NewsSportViewHolder, position: Int) {
        val dataNews = listNews[position]
        holder.setData(dataNews, position)

        holder.itemView.setOnClickListener {
            val intentDetail = Intent(context, DetailNews::class.java)
            intentDetail.putExtra(DetailNews.judulDetailBerita, dataNews.title)
            intentDetail.putExtra(DetailNews.contentDetailBerita, dataNews.detail)
            intentDetail.putExtra(DetailNews.photoDetailBerita, dataNews.photo.toString())
            context.startActivity(intentDetail)
        }
    }

}

class NewsSportViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {

    var newsSport: NewsSport? = null
    var currentPosition: Int = 0

    fun setData(data: NewsSport, position: Int) {
        itemView.txtTitle.text = data.title
        itemView.txtDesc.text = data.desc
        itemView.imageNews.setImageResource(data.photo)

    }

}
