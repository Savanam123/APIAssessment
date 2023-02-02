package com.jocata.dao.impl;

import com.jocata.dao.CompanyDao;
import com.jocata.entity.CompanyMaster;
import com.jocata.entity.EmployeeDetails;
import com.jocata.utils.HibernateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
@Repository
public class CompanyImpl implements CompanyDao {
    @Autowired
    private HibernateUtils hibernateUtils;
    @Override
    public Serializable save(CompanyMaster companyMaster) {
        return hibernateUtils.save(companyMaster);
    }

    @Override
    public <T> List<T> loadEntityByHql() {
        String hql="from CompanyMaster";
        return hibernateUtils.loadEntityByHql(hql);
    }


}
