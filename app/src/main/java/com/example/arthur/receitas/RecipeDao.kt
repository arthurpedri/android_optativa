package com.example.arthur.receitas

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface RecipeDao {
    @Query("SELECT * FROM recipe")
    fun all(): List<Recipe>

    @Query("SELECT * FROM recipe WHERE id IN (:recipeIds)")
    fun loadAllByIds(recipeIds: IntArray): List<Recipe>

    @Query("SELECT * FROM recipe WHERE nome LIKE :nome AND " + "autor LIKE :autor LIMIT 1")
    fun findByName(nome: String, autor: String): Recipe

    @Query("SELECT * FROM recipe WHERE nome LIKE :search")
    fun findAllByName(search: String): List<Recipe>

    @Query("SELECT * FROM recipe WHERE id = :id")
    fun findByID(id: Int): Recipe

    @Insert
    fun insertAll(vararg recipes: Recipe)

    @Delete
    fun delete(user: Recipe)
}
