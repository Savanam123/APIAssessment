package com.jocata.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="company_master")
public class CompanyMaster implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Integer companyid;
    private String companyname;
    @ManyToOne
    @JoinColumn(name="Company_id")
    private DepartmentMaster departmentMaster;

    public DepartmentMaster getDepartmentMaster() {
        return departmentMaster;
    }

    public void setDepartmentMaster(DepartmentMaster departmentMaster) {
        this.departmentMaster = departmentMaster;
    }


    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }
}
