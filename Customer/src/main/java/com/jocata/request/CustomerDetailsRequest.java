package com.jocata.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.sql.Date;
@JsonIgnoreProperties
@Data
public class CustomerDetailsRequest  {
    private Integer id;

    private String firstname;

    private String middlename;

    private String lastname;

    private String mobileno;

    private String emailid;

    private Date dob;

}
