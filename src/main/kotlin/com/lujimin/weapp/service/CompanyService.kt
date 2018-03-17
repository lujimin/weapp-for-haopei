package com.lujimin.weapp.service

import com.lujimin.weapp.model.Company

interface CompanyService {
    fun queryCompanyList(): List<Company>
}