package com.jocata.service.impl;

import com.jocata.dao.UserDao;
import com.jocata.entity.UserDetails;
import com.jocata.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public Serializable save(UserDetails userDetails) {
       Integer UKId= (Integer) userDao.save(userDetails);
       userDetails.setUserId(UKId);
        return userDetails;
    }

    @Override
    public UserDetails update(UserDetails userDetails) {
        userDao.update(userDetails);
        return userDetails;
    }

    @Override
    public void delete(Integer id) {
        userDao.delete(id);

    }

    @Override
    public <T> List<T> loadEntityByHql() {

        return userDao.loadEntityByHql();
    }

    @Override
    public UserDetails getById(int id) {
       return userDao.getById(id);

    }

    @Override
    public UserDetails getEntityByName(String name) {
        return   userDao.getEntityByName(name);
    }

}
