package ru.netology.coroutines.dto

import kotlinx.coroutines.Deferred

data class PostAndCommentsWithAuthor(
    val post: Post,
    val author: Author,
    val comments: List<CommentWithAuthor>
)
