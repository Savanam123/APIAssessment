package com.jocata.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@Table(name="Customer_Details")
public class CustomerDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstname;

    private String middlename;

    private String lastname;

    private String mobileno;

    private String emailid;

    private Date dob;

    @ManyToOne
    @JoinColumn(name = "customeridentity_id")
    private Customeridentity customeridentity;

}
