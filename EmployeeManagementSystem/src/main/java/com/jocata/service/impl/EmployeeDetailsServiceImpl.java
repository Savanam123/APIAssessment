package com.jocata.service.impl;

import com.jocata.dao.EmployeeDetailsDao;
import com.jocata.entity.EmployeeDetails;
import com.jocata.service.EmployeeDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class EmployeeDetailsServiceImpl implements EmployeeDetailsService {
    @Autowired
    private EmployeeDetailsDao employeeDetailsDao;
    @Override
    public Serializable save(EmployeeDetails employeeDetails) {
       return employeeDetailsDao.save(employeeDetails);
    }

    @Override
    public <T> List<T> loadEntityByHql() {

        return employeeDetailsDao.loadEntityByHql() ;
    }

    @Override
    public <T> List<T> Experience(int exp) {
      return   employeeDetailsDao.Experience(exp);
    }


}
