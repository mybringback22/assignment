package com.umar.assignment.presentation.postdetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.umar.assignment.R
import com.umar.assignment.databinding.ActivityMainBinding
import com.umar.assignment.databinding.ActivityPostDetailBinding
import com.umar.assignment.presentation.di.core.Injector
import com.umar.assignment.presentation.postlist.PostListViewModelFactory
import javax.inject.Inject

class PostDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPostDetailBinding
    private lateinit var viewModel: PostDetailViewModel
    @Inject
    lateinit var factory: PostDetailModelViewFactory
    var id : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        id = intent.getIntExtra("id" , 0 )
        binding = DataBindingUtil.setContentView(this, R.layout.activity_post_detail)
        (application as Injector).createPostDetailSubComponent().inject(this)
        viewModel = ViewModelProvider(this , factory).get(PostDetailViewModel::class.java)
        viewModel.post =  viewModel.getPostById(id)
        binding.postDetailModelView = viewModel
        binding.lifecycleOwner = this
    }


}