package com.jocata.service.impl;

import com.jocata.dao.DepartmentDao;
import com.jocata.entity.DepartmentMaster;
import com.jocata.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;
    @Override
    public Serializable save(DepartmentMaster departmentMaster) {
        return departmentDao.save(departmentMaster);
    }

    @Override
    public <T> List<T> loadEntityByHql() {
        return departmentDao.loadEntityByHql();
    }

    @Override
    public DepartmentMaster update(DepartmentMaster departmentMaster) {
        departmentDao.update(departmentMaster);

        return departmentMaster;
    }

    @Override
    public <T> List<T> getENGINEERING(String str) {
        return departmentDao.getENGINEERING(str);
    }
}
