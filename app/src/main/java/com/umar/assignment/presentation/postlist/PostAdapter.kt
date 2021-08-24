package com.umar.assignment.presentation.postlist

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.umar.assignment.R
import com.umar.assignment.data.model.PostItem
import com.umar.assignment.databinding.PostListItemBinding
import com.umar.assignment.presentation.postdetail.PostDetailActivity


class PostAdapter() : RecyclerView.Adapter<PostViewHolder>() {
    private val posts = ArrayList<PostItem>()
    fun setList(postList : List<PostItem> ){
        posts.clear()
        posts.addAll(postList)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding : PostListItemBinding = DataBindingUtil.inflate(layoutInflater , R.layout.post_list_item , parent , false )
        return PostViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.bind(posts[position])
    }

    override fun getItemCount(): Int {
        return posts.size
    }
}

class PostViewHolder(private val binding : PostListItemBinding) : RecyclerView.ViewHolder(binding.root){
    fun bind(postItem: PostItem){
        binding.titleTestView.text = postItem.title
        binding.listItemLayout.setOnClickListener {
            val intent = Intent(binding.root.context,PostDetailActivity::class.java)
            intent.putExtra("id" , postItem.id )
            binding.root.context.startActivity(intent)
        }
    }
}