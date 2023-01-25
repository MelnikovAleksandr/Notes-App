package ru.asmelnikov.android.notes_app.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(
    @PrimaryKey(autoGenerate = true)
    private val id: Long = 0,
    private val title: String,
    private val content: String,
    private val backgroundColor: Int
)
