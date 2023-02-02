package com.jocata.service;

import com.jocata.entity.EmployeeDetails;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
@Service
public interface EmployeeDetailsService {
    public Serializable save(EmployeeDetails employeeDetails);

    public <T> List<T> loadEntityByHql();
    public <T> List<T> Experience(int exp);



}
