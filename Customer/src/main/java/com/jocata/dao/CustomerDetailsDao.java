package com.jocata.dao;

import com.jocata.entity.CustomerDetails;
import com.jocata.entity.Customeridentity;

import java.io.Serializable;
import java.util.List;

public interface CustomerDetailsDao {
    public Serializable save(CustomerDetails customerDetails);

    public void update(CustomerDetails customerDetails);

    public void delete(Integer id);

    public <T> List<T> loadEntityByHql();

    public Customeridentity getById(int id);
    public Customeridentity getEntityByName(String name);
}
