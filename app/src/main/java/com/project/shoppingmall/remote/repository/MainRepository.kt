package com.project.shoppingmall.remote.repository

import androidx.paging.PagingData
import com.project.shoppingmall.model.ListItem
import kotlinx.coroutines.flow.Flow

interface MainRepository {
    fun loadList(): Flow<PagingData<ListItem>>
}