package com.umar.assignment.data.api
import com.umar.assignment.data.model.Posts
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST

interface PostService {

    @GET("/posts")
    suspend fun getPosts() : Response<Posts>

}