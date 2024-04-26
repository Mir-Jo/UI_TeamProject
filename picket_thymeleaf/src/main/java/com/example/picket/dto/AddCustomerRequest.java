package com.example.picket.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AddCustomerRequest {
    private String id;
    private String password;
    private String email;
    private String name;
    private String birthdate;
    private String tel;
    private Long point;
}
