package com.example.arthur.receitas

import android.arch.persistence.room.*


@Dao
interface CommentDao {

    @Query("SELECT * FROM comment")
    fun all(): List<Comment>

    @Query("SELECT * FROM comment WHERE id IN (:commentIds)")
    fun loadAllByIds(commentIds: IntArray): List<Comment>

    @Query("SELECT * FROM comment WHERE comentario LIKE :comentario AND " + "autor LIKE :autor LIMIT 1")
    fun findByName(comentario: String, autor: String): Comment

    @Query("SELECT * FROM comment WHERE autor LIKE :search")
    fun findAllByName(search: String): List<Comment>

    @Query("SELECT * FROM comment WHERE id = :id")
    fun findByID(id: Int): Comment

    @Insert
    fun insertAll(vararg comments: Comment)

    @Delete
    fun delete(user: Comment)
}