package com.muhammadprajadinata.detikoffline.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muhammadprajadinata.detikoffline.DetailNews
import com.muhammadprajadinata.detikoffline.R
import com.muhammadprajadinata.detikoffline.model.NewsHome
import kotlinx.android.synthetic.main.list_berita.view.*

class RvHomeNewsAdapter(val context: Context, private val listNews: List<NewsHome>) : RecyclerView.Adapter<MyHomeViewHolder>()  {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHomeViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_berita, parent, false)
        return MyHomeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listNews.size
    }

    override fun onBindViewHolder(holder: MyHomeViewHolder, position: Int) {
        val dataNews = listNews[position]
        holder.setData(dataNews, position)

        holder.itemView.setOnClickListener {
            val intentDetail = Intent(context, DetailNews::class.java)
            intentDetail.putExtra(DetailNews.judulDetailBerita, dataNews.title)
            intentDetail.putExtra(DetailNews.contentDetailBerita, dataNews.details)
            intentDetail.putExtra(DetailNews.photoDetailBerita, dataNews.photo.toString())
            context.startActivity(intentDetail)
        }
    }
}

class MyHomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var currentNews: NewsHome? = null
    var currentPosition: Int = 0

    fun setData(current: NewsHome, position: Int) {
        itemView.txtTitle.text = current.title
        itemView.txtDesc.text = current.desc
        itemView.imageNews.setImageResource(current.photo)

//        this.currentNews
//        this.currentPosition
    }
}