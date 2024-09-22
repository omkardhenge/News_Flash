package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

val pages = listOf(
    Page(
        title = "Welcome to the News Flash !",
        description = "Your go-to source for the latest tech news, delivered straight to your device",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Get news related to technology field that you like.",
        description = "Join our community of news enthusiasts! Dive into a world of insightful reporting and real-time updates.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Ready to stay informed?",
        description = "Let’s get started with News Flash and explore the latest news tailored just for you!",
        image = R.drawable.onboarding3
    )
)