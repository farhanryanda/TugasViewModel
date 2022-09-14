package com.farhanryanda.tugasviewmodel.data

import java.io.Serializable

data class News(val judul: String,val tanggal: String,val jurnalis: String,val descNews: String,val img: Int): Serializable {
}