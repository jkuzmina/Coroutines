package ru.netology.coroutines.dto

data class PostWithAuthorAndComments(
    val postWithComments: PostWithComments,
    val author: Author,
)
