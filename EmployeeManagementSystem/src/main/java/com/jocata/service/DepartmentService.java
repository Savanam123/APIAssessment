package com.jocata.service;

import com.jocata.entity.DepartmentMaster;

import java.io.Serializable;
import java.util.List;

public interface DepartmentService {

    public Serializable save(DepartmentMaster departmentMaster);
    public <T> List<T> loadEntityByHql();

    public DepartmentMaster update(DepartmentMaster departmentMaster);
    public <T> List<T> getENGINEERING(String str);
}
