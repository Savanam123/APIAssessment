package com.jocata.dao.impl;

import com.jocata.dao.UserDao;
import com.jocata.entity.UserDetails;
import com.jocata.utils.HibernateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
   private HibernateUtils hibernateUtils;
    @Override
    public Serializable save(UserDetails userDetails) {
        return hibernateUtils.save(userDetails);
    }

    @Override
    public void update(UserDetails userDetails) {
        hibernateUtils.update(userDetails);

    }

    @Override
    public void delete(Integer id) {
        String hql = "delete from UserDetails where id=" + id;
        hibernateUtils.deleteByHql(hql);

    }

    @Override
    public <T> List<T> loadEntityByHql() {
       String hql="from UserDetails";
      return  hibernateUtils.loadEntityByHql(hql);


    }

    @Override
    public UserDetails getById(int id) {
      return   hibernateUtils.getEntityById(UserDetails.class,id);

    }

    @Override
    public UserDetails getEntityByName(String name) {
        String hql="from UserDetails where userName='"+name+"'";
        UserDetails user= hibernateUtils.getEntityByHql(hql);
        return user;

    }


}
