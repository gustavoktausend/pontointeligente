package com.kotlin.testespring.pontointeligente.services

import com.kotlin.testespring.pontointeligente.documents.Empresa

interface EmpresaService {

    fun buscarPorCnpj(cnpj:String): Empresa?

    fun persistir(empresa: Empresa): Empresa
}