package com.jocata.request;

import java.io.Serializable;

public class DepartmentMasterRequest implements Serializable {
    private Integer departmentcode;

    private String departmentname;

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
