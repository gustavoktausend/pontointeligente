package com.kotlin.testespring.pontointeligente.documents

import com.kotlin.testespring.pontointeligente.enums.TipoEnum
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class Lancamento (
        val data: Date,
        val tipo: TipoEnum,
        val funcionarioId: String,
        val descricao: String? = "",
        val locallizacao: String = "",
        @Id val id: String? = null

)