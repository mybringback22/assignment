package com.umar.assignment.domain.usecase

import com.umar.assignment.data.model.PostItem
import com.umar.assignment.domain.repository.PostRepository

class GetPostByIdUseCase (private val postRepository: PostRepository ) {
    suspend fun execute(id :  Int): PostItem = postRepository.getPostById(id)
}