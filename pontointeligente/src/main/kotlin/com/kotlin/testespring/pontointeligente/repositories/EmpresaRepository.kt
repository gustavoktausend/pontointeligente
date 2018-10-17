package com.kotlin.testespring.pontointeligente.repositories

import com.kotlin.testespring.pontointeligente.documents.Empresa
import org.springframework.data.mongodb.repository.MongoRepository

interface EmpresaRepository : MongoRepository<Empresa, String> {

    fun findByCnpj(cnpj : String): Empresa
}