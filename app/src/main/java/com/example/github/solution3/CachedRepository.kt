package com.example.github.solution3

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "repositories")
data class CachedRepository(
    @PrimaryKey val id: Long,
    val name: String,
    val description: String?,
    val stars:String,
    val forks:String
)