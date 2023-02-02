package com.jocata.controller;

import com.jocata.entity.DepartmentMaster;
import com.jocata.entity.EmployeeDetails;
import com.jocata.request.DepartmentMasterRequest;
import com.jocata.request.EmployeeDetailsRequest;
import com.jocata.service.DepartmentService;
import com.jocata.service.EmployeeDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private EmployeeDetailsService employeeDetailsService;

    @PostMapping("/saveDepartment")
    public ResponseEntity<?> saveDepartment(@RequestBody DepartmentMasterRequest request){
        DepartmentMaster departmentMaster=new DepartmentMaster();
        departmentMaster.setDepartmentname(request.getDepartmentname());
        departmentService.save(departmentMaster);
        return ResponseEntity.ok("Department Master Saved Successfully");
    }
    @GetMapping("/getAllDepartmentInfo")
    public ResponseEntity< List<DepartmentMaster>> getAllDepartmentInfo(){
        List<DepartmentMaster> list=departmentService.loadEntityByHql();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @PutMapping("/departmentUpdate")
    public ResponseEntity<?> userUpdate(@RequestBody DepartmentMasterRequest request){
        DepartmentMaster departmentMaster=new DepartmentMaster();
        departmentMaster.setDepartmentcode(request.getDepartmentcode());
        departmentMaster.setDepartmentname(request.getDepartmentname());
        departmentService.update(departmentMaster);

        return ResponseEntity.ok("Department Master Update Successfully id= "+departmentMaster.getDepartmentcode());
    }
    @GetMapping("/getENGINEERING")
    public ResponseEntity<?> getExperienceEmployees(@RequestBody DepartmentMasterRequest request) {
        DepartmentMaster departmentMaster=new DepartmentMaster();
        departmentMaster.setDepartmentname(request.getDepartmentname());
        List<DepartmentMaster> list = departmentService.getENGINEERING(request.getDepartmentname());
        return new ResponseEntity<>(list,HttpStatus.OK);
    }


}
