package com.farhanryanda.tugasviewmodel.adapter

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.menu.MenuView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.farhanryanda.tugasviewmodel.DetailNewsActivity
import com.farhanryanda.tugasviewmodel.R
import com.farhanryanda.tugasviewmodel.data.News
import com.farhanryanda.tugasviewmodel.fragment.DetailNewsFragment

class NewsAdapter(var listNews: ArrayList<News>): RecyclerView.Adapter<NewsAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val cvNews = itemView.findViewById<CardView>(R.id.cv_news)
        val image = itemView.findViewById<ImageView>(R.id.img_poster)
        val judul = itemView.findViewById<TextView>(R.id.tv_judul)
        val tanggal = itemView.findViewById<TextView>(R.id.tv_tanggal)
        val desc = itemView.findViewById<TextView>(R.id.tv_desc)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.news_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.image.setImageResource(listNews[position].img)
        holder.judul.text = listNews[position].judul
        holder.tanggal.text = listNews[position].tanggal
        holder.desc.text = listNews[position].descNews
        holder.cvNews.setOnClickListener {
//            val bundle = Bundle()
//            bundle.putSerializable("news",listNews[position])
//            val context = holder.itemView.context
//            val intent = Intent(context, DetailNewsActivity::class.java)
//            intent.putExtras(bundle)
//            context.startActivity(intent)

            val detailNewsFragment = DetailNewsFragment()
            val bundle = Bundle()
            bundle.putSerializable("news",listNews[position])
            detailNewsFragment.arguments = bundle
            it.findNavController().navigate(R.id.action_homeFragment_to_detailNewsFragment,bundle)
        }
    }

    override fun getItemCount(): Int = listNews.size

    fun setDataNews(list: ArrayList<News>) {
        this.listNews = list
    }
}