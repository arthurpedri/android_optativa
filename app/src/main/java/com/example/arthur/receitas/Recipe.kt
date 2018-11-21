package com.example.arthur.receitas

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import org.w3c.dom.Text

@Entity
class Recipe(


        @ColumnInfo(name = "nome")
        var nome: String? = null,

        @ColumnInfo(name = "autor")
        var autor: String? = null,

        @ColumnInfo(name = "preparo")
        var preparo: String? = null,


        @ColumnInfo(name = "votos")
        var votos: Int = 0,

        @ColumnInfo(name = "ingredientes")
        var ingredientes: String? = null
        // classificar receita

) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}