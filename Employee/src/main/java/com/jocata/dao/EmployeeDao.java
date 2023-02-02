package com.jocata.dao;

import com.jocata.entity.Employee;

import java.io.Serializable;
import java.util.List;

public interface EmployeeDao {

    public Serializable save(Employee employee);

    public void update(Employee employee);

    public void delete(Integer id);

    public <T> List<T> loadEntityByHql();

    public Employee getEntityById(int id);

    public Employee getEntityByhql(String name);


}
