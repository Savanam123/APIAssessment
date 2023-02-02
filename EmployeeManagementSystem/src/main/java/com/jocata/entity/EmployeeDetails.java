package com.jocata.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
@Entity
@Table(name="employee_details")
public class EmployeeDetails implements Serializable {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeid;
    private String  designation;
    private String  qualification;
    private Date dob;
    private String  address;
    private Integer experience;
    private long salary;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private DepartmentMaster departmentMaster;

    public DepartmentMaster getDepartmentMaster() {
        return departmentMaster;
    }

    public void setDepartmentMaster(DepartmentMaster departmentMaster) {
        this.departmentMaster = departmentMaster;
    }

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

}
