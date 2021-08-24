package com.umar.assignment.data.repository.post.datasourceimpl

import com.umar.assignment.data.api.PostService
import com.umar.assignment.data.model.Posts
import com.umar.assignment.data.repository.post.datasource.PostRemoteDataSource
import retrofit2.Response

class PostRemoteDataSourceImpl(private  val postService : PostService) : PostRemoteDataSource {
    override suspend fun getPost(): Response<Posts> {
        return postService.getPosts()
    }
}