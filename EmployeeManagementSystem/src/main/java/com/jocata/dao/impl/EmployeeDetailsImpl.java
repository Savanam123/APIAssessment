package com.jocata.dao.impl;

import com.jocata.dao.EmployeeDetailsDao;
import com.jocata.entity.EmployeeDetails;
import com.jocata.utils.HibernateUtils;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
@Repository
public class EmployeeDetailsImpl implements EmployeeDetailsDao {
    @Autowired
    private HibernateUtils hibernateUtils;
    @Override
    public Serializable save(EmployeeDetails employeeDetails) {
        return hibernateUtils.save(employeeDetails);
    }

    @Override
    public <T> List<T> loadEntityByHql() {
        String hql="from EmployeeDetails";
        return hibernateUtils.loadEntityByHql(hql);
    }

    @Override
    public <T> List<T> Experience(int exp) {
        String hql="from EmployeeDetails where experience >'"+exp+"'";
        return hibernateUtils.loadEntityByHql(hql);
    }

    //  @Override
//    public List<EmployeeDetails> Experience(int exp) {
//        String hql="from EmployeeDetails where experience >'"+exp+"'";
//        return hibernateUtils.loadEntityByHql(hql);
//    }

    }



