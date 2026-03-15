package com.rma.cookbook.domain.model

data class Recipe(
    val id: String = "",
    val title: String = "",
    val description: String = "",
    val imageUrl: String = "",
    val authorId: String = "",
    val authorName: String = "",
    val ingredients: List<Ingredient> = emptyList(),
    val steps: List<Step> = emptyList(),
    val tags: List<String> = emptyList(),
    val averageRating: Double = 0.0,
    val ratingCount: Int = 0,
    val likeCount: Int = 0,
    val likedBy: List<String> = emptyList(),
    val createdAt: Long = 0L
)
