package com.jocata.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

//@Component
//@Entity
//@Table(name="employee_master")
public class EmployeeMaster implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeid;
    private String  employeename;
    @ManyToOne
    @JoinColumn(name="companyid")
    private CompanyMaster companyMaster;
    @ManyToOne
    @JoinColumn(name="departmentcode")
    private DepartmentMaster departmentMaster;


    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public CompanyMaster getCompanyMaster() {
        return companyMaster;
    }

    public void setCompanyMaster(CompanyMaster companyMaster) {
        this.companyMaster = companyMaster;
    }

    public DepartmentMaster getDepartmentMaster() {
        return departmentMaster;
    }

    public void setDepartmentMaster(DepartmentMaster departmentMaster) {
        this.departmentMaster = departmentMaster;
    }
}
