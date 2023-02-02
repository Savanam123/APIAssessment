package com.jocata.service.impl;

import com.jocata.dao.CompanyDao;
import com.jocata.entity.CompanyMaster;
import com.jocata.entity.EmployeeDetails;
import com.jocata.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyDao companyDao;
    @Override
    public Serializable save(CompanyMaster companyMaster) {
        return companyDao.save(companyMaster);
    }

    @Override
    public <T> List<T> loadEntityByHql() {
        return companyDao.loadEntityByHql();
    }


}
