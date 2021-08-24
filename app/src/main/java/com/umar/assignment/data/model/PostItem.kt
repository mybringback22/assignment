package com.umar.assignment.data.model


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName =  "post_table")
data class PostItem(
    @PrimaryKey
    @SerializedName("id")
    val id: Int,

    @SerializedName("body")
    val body: String,

    @SerializedName("title")
    val title: String,

    @SerializedName("userId")
    val userId: Int
)