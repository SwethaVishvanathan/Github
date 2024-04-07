package com.example.github.solution3

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.navigation.compose.rememberNavController
@Composable
fun RepositoryListScreen(viewModel: RepositoryViewModel) {
    val repositories by viewModel.repositories.observeAsState(listOf())

    LazyColumn {
        items(repositories) { repository ->
            RepositoryItem(repository)
        }
    }
    SearchScreen(viewModel)
}

