package com.jocata.service;

import com.jocata.entity.CustomerDetails;
import com.jocata.entity.Customeridentity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CustomerDetailsService {
    public CustomerDetails save(CustomerDetails customerDetails);

    public void update(CustomerDetails customerDetails);

    public void delete(Integer id);

    public <T> List<T> loadEntityByHql();

    public Customeridentity getById(int id);
    public Customeridentity getEntityByName(String name);
}
