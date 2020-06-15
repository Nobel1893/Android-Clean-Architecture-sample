package com.bluecrunch.data.repositories

import com.bluecrunch.domain.entities.NewsList
import com.bluecrunch.domain.entities.NewsRepository

class NewsRepository : NewsRepository {
    override suspend fun getAllNews(): NewsList {
        TODO("Not yet implemented")
    }
}