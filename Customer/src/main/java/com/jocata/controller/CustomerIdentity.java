package com.jocata.controller;

import com.jocata.entity.CustomerDetails;
import com.jocata.entity.Customeridentity;
import com.jocata.request.CustomerDetailsRequest;
import com.jocata.request.CustomeridentityRequest;
import com.jocata.service.CustomerDetailsService;
import com.jocata.service.CustomeridentityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerIdentity {
    @Autowired
    private CustomeridentityService customeridentityService;
    @Autowired
    private CustomerDetailsService customerDetailsService;

    @PostMapping("/saveCustomer")
    public ResponseEntity<?> saveCustomer(@RequestBody CustomeridentityRequest request, CustomerDetailsRequest request1){
        Customeridentity customeridentity=new Customeridentity();
        customeridentity.setIdnum(request.getIdnum());
        customeridentity.setNameoncard(request.getNameoncard());



        CustomerDetails customerDetails=new CustomerDetails();
        customerDetails.setFirstname(request1.getFirstname());
        customerDetails.setMiddlename(request1.getMiddlename());
        customerDetails.setLastname(request1.getLastname());
        customerDetails.setMobileno(request1.getMobileno());
        customerDetails.setEmailid(request1.getEmailid());
        customerDetails.setDob(request1.getDob());
        customeridentityService.save(customeridentity);
        return ResponseEntity.ok("Data Saved Successfully");

    }
}
