package com.jocata.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties
@Data
public class CustomeridentityRequest {
    private Integer id;
    private String idnum;
    private String nameoncard;
}
