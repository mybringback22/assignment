package com.umar.assignment.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.umar.assignment.data.model.PostItem

@Dao
interface PostDAO {

    @Query("SELECT * FROM post_table")
    suspend fun getPost(): List<PostItem>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun savePost(post : List<PostItem>)

    @Query("DELETE FROM post_table")
    suspend fun deleteAllPost()

    @Query("SELECT * FROM post_table WHERE id =:id")
    fun loadSingle(id: Int): PostItem

}