package com.jocata.controller;

import com.jocata.entity.CompanyMaster;
import com.jocata.entity.DepartmentMaster;
import com.jocata.request.CompanyMasterRequest;
import com.jocata.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompanyController {
    @Autowired
    private CompanyService companyService;
@PostMapping("/saveCompany")
    public ResponseEntity<?> saveCompany(@RequestBody CompanyMasterRequest request){
       CompanyMaster companyMaster=new CompanyMaster();
       companyMaster.setCompanyname(request.getCompanyname());
       companyService.save(companyMaster);
        return ResponseEntity.ok("CompanyMaster saved Successfully");
    }
    @GetMapping("/getAllCompanyEmployee")
    public ResponseEntity<List<CompanyMaster>> getAllDepartmentInfo(){
        List<CompanyMaster> list=companyService.loadEntityByHql();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
