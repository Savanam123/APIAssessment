package com.jocata.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="department_master")
public class DepartmentMaster implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer departmentcode;

   private String departmentname;
    @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn
   private EmployeeDetails employeeDetails;

    public EmployeeDetails getEmployeeDetails() {
        return employeeDetails;
    }

    public void setEmployeeDetails(EmployeeDetails employeeDetails) {
        this.employeeDetails = employeeDetails;
    }

    public Integer getDepartmentcode() {
        return departmentcode;
    }

    public void setDepartmentcode(Integer departmentcode) {
        this.departmentcode = departmentcode;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

}
