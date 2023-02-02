package com.jocata.service;

import com.jocata.entity.UserDetails;

import java.io.Serializable;
import java.util.List;

public interface UserService {
    public Serializable save(UserDetails userDetails);

    public UserDetails update(UserDetails userDetails);

    public void delete(Integer id);

    public <T> List<T> loadEntityByHql();

    public UserDetails getById(int id);
    public UserDetails getEntityByName(String name);
}
