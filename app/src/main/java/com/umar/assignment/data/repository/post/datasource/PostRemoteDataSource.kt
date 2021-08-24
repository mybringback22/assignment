package com.umar.assignment.data.repository.post.datasource

import com.umar.assignment.data.model.PostItem
import com.umar.assignment.data.model.Posts
import retrofit2.Response

interface PostRemoteDataSource {
    suspend fun getPost():Response<Posts>
}