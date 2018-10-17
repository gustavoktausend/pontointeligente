package com.kotlin.testespring.pontointeligente.services.impl

import com.kotlin.testespring.pontointeligente.documents.Empresa
import com.kotlin.testespring.pontointeligente.repositories.EmpresaRepository
import com.kotlin.testespring.pontointeligente.services.EmpresaService
import org.springframework.stereotype.Service

@Service
class EmpresaServiceImpl(val empresaRepository: EmpresaRepository) : EmpresaService {

    override fun buscarPorCnpj(cnpj: String): Empresa? = empresaRepository.findByCnpj(cnpj)

    override fun persistir(empresa: Empresa): Empresa = empresaRepository.save(empresa)
}