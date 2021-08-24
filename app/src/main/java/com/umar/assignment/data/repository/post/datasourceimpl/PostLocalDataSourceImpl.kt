package com.umar.assignment.data.repository.post.datasourceimpl

import com.umar.assignment.data.db.PostDAO
import com.umar.assignment.data.model.PostItem
import com.umar.assignment.data.repository.post.datasource.PostLocalDataSource
import kotlinx.coroutines.*

class PostLocalDataSourceImpl(private val postDAO: PostDAO): PostLocalDataSource {
    override suspend fun getPostFromDb(): List<PostItem> {
       return  postDAO.getPost()
    }

    override suspend fun savePostInDb(posts: List<PostItem>) {
        CoroutineScope(Dispatchers.IO).launch {
            postDAO.savePost(posts)
        }
    }

    override suspend fun clearPostDataInDB() {
        CoroutineScope(Dispatchers.IO).launch {
            postDAO.deleteAllPost()
        }
    }

    override suspend fun getPostById(id : Int): PostItem {
        lateinit var deferred : Deferred<PostItem>
        coroutineScope {

            deferred = async(Dispatchers.IO) {

                return@async postDAO.loadSingle(id)
            }
        }
        return deferred.await()
    }


}