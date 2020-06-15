package com.bluecrunch.data.dataSources.news

import com.bluecrunch.domain.entities.Sources


interface SourcesOfflineDataSource {
    fun cache(data: Sources) {}
    fun getAllNews(): Sources = throw NotImplementedError()
}

interface SourcesOnlineDataSource {
    suspend fun getNews(): Sources = throw NotImplementedError()
}

class SourcesOfflineDataSourceImpl : NewsOfflineDataSource
class SourcesOnlineDataSourceImpl : NewsOnlineDataSource