package com.umar.assignment.domain.repository

import com.umar.assignment.data.model.PostItem

interface PostRepository {
    suspend fun getPost(): List<PostItem>?
    suspend fun updatePost(): List<PostItem>?
    suspend fun getPostById(id : Int): PostItem
}