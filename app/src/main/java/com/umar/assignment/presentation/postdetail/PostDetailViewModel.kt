package com.umar.assignment.presentation.postdetail

import androidx.lifecycle.*
import com.umar.assignment.data.model.PostItem
import com.umar.assignment.domain.usecase.GetPostByIdUseCase
import kotlinx.coroutines.*

class PostDetailViewModel(private  val getPostByIdUseCase: GetPostByIdUseCase) : ViewModel(){
    lateinit var post : LiveData<PostItem>
     fun getPostById (id : Int) = liveData {
         val posts  = getPostByIdUseCase.execute(id)
         emit(posts)
     }



}