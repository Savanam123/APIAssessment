package com.jocata.dao;

import com.jocata.entity.Customeridentity;

import java.io.Serializable;
import java.util.List;

public interface CustomeridentityDao {

    public Serializable save(Customeridentity customeridentity);

    public void update(Customeridentity customeridentity);

    public void delete(Integer id);

    public <T> List<T> loadEntityByHql();

    public Customeridentity getById(int id);
    public Customeridentity getEntityByName(String name);
}
