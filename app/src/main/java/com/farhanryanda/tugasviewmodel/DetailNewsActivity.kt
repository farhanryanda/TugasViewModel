package com.farhanryanda.tugasviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.farhanryanda.tugasviewmodel.data.News
import com.farhanryanda.tugasviewmodel.databinding.ActivityDetailNewsBinding

class DetailNewsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailNewsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val getData = intent.getSerializableExtra("news") as News
        binding.imgPoster.setImageResource(getData.img)
        binding.tvJudul.text = getData.judul
        binding.tvTanggal.text = getData.tanggal
        binding.tvJurnalis.text = getData.jurnalis
        binding.tvDesc.text = getData.descNews
    }
}