package com.jocata.service.impl;

import com.jocata.dao.CustomeridentityDao;
import com.jocata.entity.Customeridentity;
import com.jocata.service.CustomeridentityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
@Service
public class CustomeridentityServiceImpl implements CustomeridentityService {
    @Autowired
    private CustomeridentityDao customeridentityDao;

    @Override
    public Serializable save(Customeridentity customeridentity) {
        Integer UKId= (Integer) customeridentityDao.save(customeridentity);
        customeridentity.setId(UKId);
        return customeridentity;
    }

    @Override
    public void update(Customeridentity customeridentity) {

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
