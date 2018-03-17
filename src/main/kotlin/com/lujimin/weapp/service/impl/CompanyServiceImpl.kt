package com.lujimin.weapp.service.impl

import com.lujimin.weapp.mapper.CompanyMapper
import com.lujimin.weapp.model.Company
import com.lujimin.weapp.service.CompanyService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CompanyServiceImpl : CompanyService {

    @Autowired
    lateinit var companyMapper: CompanyMapper

    override fun queryCompanyList(): List<Company> {
        return companyMapper.queryCompanyList()
    }

}