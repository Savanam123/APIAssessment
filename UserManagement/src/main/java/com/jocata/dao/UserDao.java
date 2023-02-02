package com.jocata.dao;

import com.jocata.entity.UserDetails;

import java.io.Serializable;
import java.util.List;

public interface UserDao {
    public Serializable save(UserDetails userDetails);

    public void update(UserDetails userDetails);

    public void delete(Integer id);

    public <T> List<T> loadEntityByHql();

    public UserDetails getById(int id);
    public UserDetails getEntityByName(String name);

}
