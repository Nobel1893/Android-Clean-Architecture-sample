package com.bluecrunch.data.repositories

import com.bluecrunch.domain.entities.SourceRepository
import com.bluecrunch.domain.entities.Sources

class SourcesRepositoryImpl : SourceRepository {
    override suspend fun getSources(): Sources {
        TODO("Not yet implemented")
    }
}