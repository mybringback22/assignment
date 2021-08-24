package com.umar.assignment.data.db
import androidx.room.Database
import androidx.room.RoomDatabase
import com.umar.assignment.data.db.PostDAO
import com.umar.assignment.data.model.PostItem

@Database( entities =  [PostItem::class] , version = 1 , exportSchema = false)
abstract  class PostsDatabase : RoomDatabase() {
    abstract fun postDAO() : PostDAO
}