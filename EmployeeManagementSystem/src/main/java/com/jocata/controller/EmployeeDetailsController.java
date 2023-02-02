package com.jocata.controller;

import com.jocata.entity.EmployeeDetails;
import com.jocata.request.EmployeeDetailsRequest;
import com.jocata.response.EmployeedetailsResponse;
import com.jocata.service.EmployeeDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeDetailsController {
   @Autowired
    private EmployeeDetailsService employeeDetailsService;

    @PostMapping("/employeeDetails")
    public ResponseEntity<?> saveEmployeeDetails(@RequestBody EmployeeDetailsRequest request){
        EmployeeDetails employeeDetails=new EmployeeDetails();
        employeeDetails.setDesignation(request.getDesignation());
        employeeDetails.setQualification(request.getQualification());
        employeeDetails.setDob(request.getDob());
        employeeDetails.setAddress(request.getAddress());
        employeeDetails.setExperience(request.getExperience());
        employeeDetails.setSalary(request.getSalary());

        employeeDetailsService.save(employeeDetails);

        EmployeedetailsResponse response=new EmployeedetailsResponse();
        response.setEmployeeid(employeeDetails.getEmployeeid());
        response.setDesignation(employeeDetails.getDesignation());
        response.setQualification(employeeDetails.getQualification());
        response.setDob(employeeDetails.getDob());
        response.setAddress(employeeDetails.getAddress());
        response.setExperience(employeeDetails.getExperience());
        response.setSalary(employeeDetails.getSalary());
        response.setMeaasge("Employee Details Saved Successsfully id= " +employeeDetails.getEmployeeid());
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }
    @GetMapping("/getAllEmployeeDetails")
    public ResponseEntity<?> getAllEmployeeDetails(){
        List<EmployeeDetails> list=employeeDetailsService.loadEntityByHql();
        return new ResponseEntity<List<EmployeeDetails>>(list,HttpStatus.OK);
    }
    @GetMapping("/getExperienceEmployees")
    public ResponseEntity<?> getExperienceEmployees(@RequestBody EmployeeDetailsRequest request) {
        EmployeeDetails employeeDetails=new EmployeeDetails();
        employeeDetails.setExperience(request.getExperience());
        List<EmployeeDetails> list = employeeDetailsService.Experience(request.getExperience());
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
}
