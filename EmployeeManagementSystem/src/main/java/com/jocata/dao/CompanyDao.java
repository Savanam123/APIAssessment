package com.jocata.dao;

import com.jocata.entity.CompanyMaster;
import com.jocata.entity.EmployeeDetails;

import java.io.Serializable;
import java.util.List;

public interface CompanyDao {
    public Serializable save(CompanyMaster companyMaster);

    public <T> List<T> loadEntityByHql();

}
