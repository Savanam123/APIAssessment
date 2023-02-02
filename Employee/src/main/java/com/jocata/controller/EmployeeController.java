package com.jocata.controller;

import com.jocata.entity.Employee;
import com.jocata.request.EmployeeRequest;
import com.jocata.response.EmployeeResponse;
import com.jocata.response.EmployeeResponse1;
import com.jocata.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController

public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/saveEmployee")
    public ResponseEntity<?> saveEmployee(@RequestBody EmployeeRequest request) {
        Employee employee=new Employee();
        employee.setEname(request.getEname());
        employee.setLname(request.getLname());
        employee.setMobile(request.getMobile());
        employee.setEmail(request.getEmail());
        employee.setHireDate(request.getHireDate());
        employee.setPinCode(request.getPinCode());
         employeeService.save(employee);

        EmployeeResponse response=new EmployeeResponse();
        response.setEmpId(employee.getEmpId());
        response.setEname(employee.getEname());
        response.setLname(employee.getLname());
        response.setMobile(employee.getMobile());
        response.setEmail(employee.getEmail());
        response.setHireDate(employee.getHireDate());
        response.setPinCode(employee.getPinCode());
        response.setMessage("Successfully data saved : " +employee.getEmpId());
        return new  ResponseEntity<>(response, HttpStatus.OK);
    }
    @PutMapping("/updateEmployee")
    public ResponseEntity<?> updateEmployee(@RequestBody EmployeeRequest request) {
        Employee employee=new Employee();
        employee.setEmpId(request.getEmpId());
        employee.setEname(request.getEname());
        employee.setLname(request.getLname());
        employee.setMobile(request.getMobile());
        employee.setEmail(request.getEmail());
        employee.setHireDate(request.getHireDate());
        employee.setPinCode(request.getPinCode());
        employeeService.update(employee);

        EmployeeResponse response=new EmployeeResponse();
        response.setEmpId(employee.getEmpId());
        response.setEname(employee.getEname());
        response.setLname(employee.getLname());
        response.setMobile(employee.getMobile());
        response.setEmail(employee.getEmail());
        response.setHireDate(employee.getHireDate());
        response.setPinCode(employee.getPinCode());
        response.setMessage("Successfully data Update : " +employee.getEmpId());
        return new  ResponseEntity<>(response, HttpStatus.OK);
    }
    @DeleteMapping("/deleteEmployee")
    public ResponseEntity<?> deleteEmployee(@RequestBody EmployeeRequest request){
        Employee employee=new Employee();
        employee.setEmpId(request.getEmpId());

        employeeService.delete(request.getEmpId());
        EmployeeResponse1 response1=new EmployeeResponse1();
        response1.setEmpId(employee.getEmpId());
        response1.setMessage("Successfully Delete in Record: "+response1.getEmpId());
        return new ResponseEntity<>(response1,HttpStatus.OK);
    }
    @GetMapping("/getAllEmployee")
    public ResponseEntity<?> getAllEmployee(){
        List<Employee> list=employeeService.loadEntityByHql();
        return new ResponseEntity<List<Employee>>(list,HttpStatus.OK);
    }

    @GetMapping("/getById/{id}")
    public Employee get(@PathVariable int id){
        Employee employee = employeeService.getEntityById(id);
        if(employee==null) {
            throw new RuntimeException("Employee with id " + id + " is not found");
        }
        return employee;
    }
    @GetMapping("userByName/{name}")
    public List<Employee> employeeByName(@PathVariable("name") String name) {
        return (List<Employee>) employeeService.getEntityByhql(name);
    }
}
