package com.umar.assignment.data.repository.post

import android.util.Log
import com.umar.assignment.data.model.PostItem
import com.umar.assignment.data.repository.post.datasource.PostRemoteDataSource
import com.umar.assignment.data.repository.post.datasource.PostLocalDataSource
import com.umar.assignment.domain.repository.PostRepository
import java.lang.Exception

class PostRepositoryImpl(
    private val postRemoteDataSource: PostRemoteDataSource,
    private val postLocalDataSource: PostLocalDataSource
) : PostRepository {
    override suspend fun getPost(): List<PostItem>? {
        return  getPostFromDB()
    }

    override suspend fun updatePost(): List<PostItem>? {
        val posts = getPostFromAPI()
        postLocalDataSource.clearPostDataInDB()
        postLocalDataSource.savePostInDb(posts)
        return posts
    }

    override suspend fun getPostById(id : Int): PostItem {
        return postLocalDataSource.getPostById(id)
    }


    private suspend fun getPostFromAPI() : List<PostItem>{
        lateinit var posts : List<PostItem>
        try {
            val response = postRemoteDataSource.getPost()
            val body = response.body()
            if(body!=null){
                posts = body
            }
        }catch (e:Exception){
            Log.i("Exception", e.message.toString())
        }

        return posts
    }

    private suspend fun getPostFromDB() : List<PostItem>{
        lateinit var posts : List<PostItem>
        try {
            posts = postLocalDataSource.getPostFromDb()
        }catch (e:Exception){
            Log.i("Exception", e.message.toString())
        }
        if(posts.isEmpty()){
            posts = getPostFromAPI()
            postLocalDataSource.savePostInDb(posts)
        }
        return posts
    }

}