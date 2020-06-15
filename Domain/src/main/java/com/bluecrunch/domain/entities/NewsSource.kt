package com.bluecrunch.domain.entities

typealias Sources = List<SourceDTO>
typealias Source = SourceDTO

data class SourceDTO(
    val id: Int? = null,
    val name: String? = null
)

interface SourceRepository {
    suspend fun getSources(): Sources
}