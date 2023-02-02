package com.jocata.dao.dao.impl;

import com.jocata.dao.EmployeeDao;
import com.jocata.entity.Employee;
import com.jocata.utils.HibernateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
   @Autowired
    private HibernateUtils hibernateUtils;
    @Override
    public Serializable save(Employee employee) {
      return hibernateUtils.save(employee);
    }

    @Override
    public void update(Employee employee) {
        hibernateUtils.update(employee);

    }

    @Override
    public void delete(Integer id) {
        String hql = "delete from Employee where id=" + id;
        hibernateUtils.deleteByHql(hql);

    }

    @Override
    public <T> List<T> loadEntityByHql() {
        String hql="from Employee";
        return hibernateUtils.loadEntityByHql(hql);
    }

    @Override
    public Employee getEntityById(int id) {
        return hibernateUtils.getEntityById(Employee.class,id);
    }

    @Override
    public Employee getEntityByhql(String name) {
        String hql="from Users u where u.userName='"+name+"'";
        return hibernateUtils.getEntityByHql(name);
    }


}
