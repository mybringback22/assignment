package com.umar.assignment.domain.usecase

import com.umar.assignment.data.model.PostItem
import com.umar.assignment.domain.repository.PostRepository

class GetPostsUseCase(private val postRepository: PostRepository) {
    suspend fun execute(): List<PostItem>? = postRepository.getPost()
}