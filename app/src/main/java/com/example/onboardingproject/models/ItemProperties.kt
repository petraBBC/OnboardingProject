package com.example.onboardingproject.models

import java.util.*

data class ItemProperties(
    val type: String,
    val title: String,
    val url: String,
    val sectionLabel: String,
    val isLiveL: Boolean,
    val lastUpdatedText: String,
    val mediaType: String,
    val contentType: String,
    val lastUpdatedTimeStamp: Long,
    val image: ImageProperties)

