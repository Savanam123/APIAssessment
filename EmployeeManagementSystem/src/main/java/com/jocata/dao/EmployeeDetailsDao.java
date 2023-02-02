package com.jocata.dao;

import com.jocata.entity.EmployeeDetails;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
@Repository
public interface EmployeeDetailsDao {
    public Serializable save(EmployeeDetails employeeDetails);

    public <T> List<T> loadEntityByHql();

    public <T> List<T> Experience(int exp);



}
