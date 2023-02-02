package com.jocata.service.impl;

import com.jocata.dao.CustomerDetailsDao;
import com.jocata.entity.CustomerDetails;
import com.jocata.entity.Customeridentity;
import com.jocata.service.CustomerDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService {
    @Autowired
    private CustomerDetailsDao customerDetailsDao;
    @Override
    public CustomerDetails save(CustomerDetails customerDetails) {
        Integer UKId= (Integer) customerDetailsDao.save(customerDetails);
        customerDetails.setId(UKId);
        return customerDetails;
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
