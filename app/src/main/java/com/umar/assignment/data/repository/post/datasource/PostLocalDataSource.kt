package com.umar.assignment.data.repository.post.datasource

import com.umar.assignment.data.model.PostItem

interface PostLocalDataSource {
    suspend fun getPostFromDb():List<PostItem>
    suspend fun savePostInDb(posts :List<PostItem> )
    suspend fun  clearPostDataInDB()
    suspend fun getPostById(id : Int):PostItem
}