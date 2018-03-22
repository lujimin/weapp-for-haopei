package com.lujimin.weapp.controller

import com.lujimin.weapp.model.Company
import com.lujimin.weapp.service.CompanyService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CompanyController {

    @Autowired
    lateinit var companyService: CompanyService

    @GetMapping("/companies")
    fun queryCompanyList(): List<Company> {
        return companyService.queryCompanyList()
    }

}