package com.jocata.dao.impl;

import com.jocata.dao.CustomerDetailsDao;
import com.jocata.entity.CustomerDetails;
import com.jocata.entity.Customeridentity;
import com.jocata.utils.HibernateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
@Repository
public class CustomerDetailsImpl implements CustomerDetailsDao {

    @Autowired
    private HibernateUtils hibernateUtils;
    @Override
    public Serializable save(CustomerDetails customerDetails) {
        return hibernateUtils.save(customerDetails);
    }

    @Override
    public void update(CustomerDetails customerDetails) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public <T> List<T> loadEntityByHql() {
        return null;
    }

    @Override
    public Customeridentity getById(int id) {
        return null;
    }

    @Override
    public Customeridentity getEntityByName(String name) {
        return null;
    }
}
