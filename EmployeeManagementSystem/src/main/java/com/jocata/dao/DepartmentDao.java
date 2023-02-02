package com.jocata.dao;

import com.jocata.entity.CompanyMaster;
import com.jocata.entity.DepartmentMaster;

import java.io.Serializable;
import java.util.List;

public interface DepartmentDao {

    public Serializable save(DepartmentMaster departmentMaster);
    public <T> List<T> loadEntityByHql();

    public void update(DepartmentMaster userDetails);

    public <T> List<T> getENGINEERING(String str);
}
