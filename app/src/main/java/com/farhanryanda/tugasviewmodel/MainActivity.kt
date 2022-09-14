package com.farhanryanda.tugasviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.farhanryanda.tugasviewmodel.adapter.NewsAdapter
import com.farhanryanda.tugasviewmodel.data.News
import com.farhanryanda.tugasviewmodel.databinding.ActivityMainBinding
import com.farhanryanda.tugasviewmodel.databinding.NewsItemBinding
import com.farhanryanda.tugasviewmodel.viewmodel.NewsViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var newsViewModel: NewsViewModel
    private lateinit var newsAdapter: NewsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//
//        newsAdapter = NewsAdapter(ArrayList())
//        binding.rvMain.adapter = newsAdapter
//        val lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
//        binding.rvMain.layoutManager = lm
//
//        newsViewModel = ViewModelProvider(this).get(NewsViewModel::class.java)
//        newsViewModel.getNews()
//        newsViewModel.listNews.observe(this, {
//            newsAdapter.setDataNews(it as ArrayList<News> /* = java.util.ArrayList<com.farhanryanda.tugasviewmodel.data.News> */)
//        })
    }
}