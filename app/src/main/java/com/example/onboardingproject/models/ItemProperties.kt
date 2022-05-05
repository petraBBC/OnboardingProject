package com.example.onboardingproject.models


data class SportResponse (val data:SportData)
data class SportData (val topic:SportTopic,val items:List<ItemProperties>)
data class SportTopic(val title:String,val url:String)

data class ItemProperties(
    val type: String,
    val title: String,
    val url: String,
    val sectionLabel: String,
    val isLive: Boolean?,
    val lastUpdatedText: String,
    val mediaType: String?,
    val contentType: String?,
    val lastUpdatedTimeStamp: Long?,
    val image: ImageProperties)

