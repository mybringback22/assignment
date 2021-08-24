package com.umar.assignment.presentation.postlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.umar.assignment.R
import com.umar.assignment.databinding.ActivityMainBinding
import com.umar.assignment.presentation.di.core.Injector
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var factory: PostListViewModelFactory
    private lateinit var viewModel: PostListViewModel
    private lateinit var postAdapter: PostAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        (application as Injector).createPostListSubComponent().inject(this)
        viewModel = ViewModelProvider(this, factory).get(PostListViewModel::class.java)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.postRecyclerView.layoutManager = LinearLayoutManager(this)
        postAdapter = PostAdapter()
        binding.postRecyclerView.adapter = postAdapter
        getPostList()
    }


    private fun getPostList() {
        binding.progressBar.visibility = View.VISIBLE
        val responseLiveData = viewModel.getPosts()
        responseLiveData.observe(this, Observer {
            if (it != null) {
                postAdapter.setList(it)
                postAdapter.notifyDataSetChanged()
            } else {
                binding.progressBar.visibility = View.GONE
            }
        })
        binding.progressBar.visibility = View.GONE
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.update , menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.actionUpdate->{
                updatePost()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private  fun updatePost(){
        Log.i("MYTAG" , "UpdatedCalled")
        binding.progressBar.visibility = View.VISIBLE
        val responseLiveData = viewModel.updatePosts()
        responseLiveData.observe(this, Observer {
            Log.i("MYTAG" , "API HIT")
            if (it != null) {
                postAdapter.setList(it)
                postAdapter.notifyDataSetChanged()
            } else {
                binding.progressBar.visibility = View.GONE
            }
        })
        binding.progressBar.visibility = View.GONE
        Log.i("MYTAG" , "END")
    }


}