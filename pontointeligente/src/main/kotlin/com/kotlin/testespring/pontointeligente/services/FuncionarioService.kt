package com.kotlin.testespring.pontointeligente.services

import com.kotlin.testespring.pontointeligente.documents.Funcionario

interface FuncionarioService {

    fun persistir(funcionario: Funcionario): Funcionario

    fun buscarPorCpf( cpf: String): Funcionario?

    fun buscarPorEmail (email:String) : Funcionario?

    fun buscarPorId (id: String) : Funcionario?

}