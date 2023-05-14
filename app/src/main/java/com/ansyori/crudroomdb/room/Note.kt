package com.ansyori.crudroomdb.room
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Time

@Entity
data class Skripsi(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val judul: String,
    val abstrak: String,
)
