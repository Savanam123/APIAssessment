package com.jocata.service.service.impl;

import com.jocata.dao.EmployeeDao;
import com.jocata.entity.Employee;
import com.jocata.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
    @Override
    public Serializable save(Employee employee) {
        Integer newPKID = (Integer) employeeDao.save(employee);
        employee.setEmpId(newPKID);
        return employee;
    }

    @Override
    public Employee update(Employee employee) {
        employeeDao.update(employee);
        return employee;
    }

    @Override
    public void delete(Integer id) {
        employeeDao.delete(id);

    }

    @Override
    public <T> List<T> loadEntityByHql() {
      return employeeDao.loadEntityByHql();
    }

    @Override
    public Employee getEntityById(int id) {

        return employeeDao.getEntityById(id);
    }

    @Override
    public Employee getEntityByhql(String name) {
        return employeeDao.getEntityByhql(name);
    }


}
