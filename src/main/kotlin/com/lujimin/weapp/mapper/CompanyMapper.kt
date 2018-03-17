package com.lujimin.weapp.mapper

import com.lujimin.weapp.model.Company
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface CompanyMapper {

    @Select("""
        SELECT company_id, company_name FROM company
    """)
    fun queryCompanyList(): List<Company>
}