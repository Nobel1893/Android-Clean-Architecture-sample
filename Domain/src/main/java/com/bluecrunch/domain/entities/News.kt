package com.bluecrunch.domain.entities

typealias NewsList = List<NewsDTO>
typealias News = NewsDTO

data class NewsDTO(
    val id: Int? = null,
    val title: String? = null,
    val date: String? = null,
    val content: String? = null,
    val imageURL: String? = null
)

interface NewsRepository {
    suspend fun getAllNews(): NewsList
}