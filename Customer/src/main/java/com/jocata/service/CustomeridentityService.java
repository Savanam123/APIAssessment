package com.jocata.service;

import com.jocata.entity.Customeridentity;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
@Service
public interface CustomeridentityService {
    public Serializable save(Customeridentity customeridentity);

    public void update(Customeridentity customeridentity);

    public void delete(Integer id);

    public <T> List<T> loadEntityByHql();

    public Customeridentity getById(int id);
    public Customeridentity getEntityByName(String name);
}
