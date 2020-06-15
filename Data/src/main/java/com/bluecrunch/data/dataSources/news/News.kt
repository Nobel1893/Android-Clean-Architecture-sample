package com.bluecrunch.data.dataSources.news

import com.bluecrunch.domain.entities.NewsList

interface NewsOfflineDataSource {
    fun cacheNews(data: NewsList) {}
    fun getAllNews(): NewsList = throw NotImplementedError()
}

interface NewsOnlineDataSource {
    suspend fun getNews(): NewsList = throw NotImplementedError()
}

class NewsOfflineDataSourceImpl : NewsOfflineDataSource
class NewsOnlineDataSourceImpl : NewsOnlineDataSource