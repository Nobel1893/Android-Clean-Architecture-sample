package com.bluecrunch.data.models.responses

import com.bluecrunch.data.models.SourcesItem
import com.google.gson.annotations.SerializedName

data class SourcesResponse(

    @field:SerializedName("sources")
    val sources: List<SourcesItem?>? = null,

    @field:SerializedName("status")
    val status: String? = null
)