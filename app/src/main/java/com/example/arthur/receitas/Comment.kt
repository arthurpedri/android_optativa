package com.example.arthur.receitas

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.ForeignKey.CASCADE
import android.arch.persistence.room.PrimaryKey
import org.w3c.dom.Text


@Entity(
        foreignKeys = [(
            ForeignKey(
                    entity = Recipe::class,
                    parentColumns = arrayOf("id"),
                    childColumns = arrayOf("recipeId"),
                    onDelete = CASCADE
            )
        )]
)
class Comment(
        @ColumnInfo(name = "recipeId")
        var recipeId: Int,


        @ColumnInfo(name = "autor")
        var autor: String? = null,

        @ColumnInfo(name = "comentario")
        var comentario: String? = null

) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}



