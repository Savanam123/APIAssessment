package com.jocata.dao.impl;

import com.jocata.dao.DepartmentDao;
import com.jocata.entity.DepartmentMaster;
import com.jocata.utils.HibernateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public class DepartmentImpl implements DepartmentDao {

    @Autowired
    private HibernateUtils hibernateUtils;
    @Override
    public Serializable save(DepartmentMaster departmentMaster) {
        return hibernateUtils.save(departmentMaster);
    }

    @Override
    public <T> List<T> loadEntityByHql() {
        String hql="from DepartmentMaster";
        return hibernateUtils.loadEntityByHql(hql);
    }

    @Override
    public void update(DepartmentMaster departmentMaster) {
        hibernateUtils.update(departmentMaster);
    }

    @Override
    public <T> List<T> getENGINEERING(String str) {
        String hql="from DepartmentMaster where departmentname ='"+str+"'";
        return hibernateUtils.loadEntityByHql(hql);
    }
}
