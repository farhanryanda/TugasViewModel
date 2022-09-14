package com.farhanryanda.tugasviewmodel.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.farhanryanda.tugasviewmodel.adapter.NewsAdapter
import com.farhanryanda.tugasviewmodel.data.News
import com.farhanryanda.tugasviewmodel.databinding.FragmentHomeBinding
import com.farhanryanda.tugasviewmodel.viewmodel.NewsViewModel


class HomeFragment : Fragment() {
    private lateinit var newsViewModel: NewsViewModel
    private lateinit var newsAdapter: NewsAdapter
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        newsAdapter = NewsAdapter(ArrayList())
        binding.rvMain.adapter = newsAdapter
        val lm = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.rvMain.layoutManager = lm

        newsViewModel = ViewModelProvider(this).get(NewsViewModel::class.java)
        newsViewModel.getNews()
        newsViewModel.listNews.observe(viewLifecycleOwner, {
            newsAdapter.setDataNews(it as ArrayList<News> /* = java.util.ArrayList<com.farhanryanda.tugasviewmodel.data.News> */)
        })
    }
}