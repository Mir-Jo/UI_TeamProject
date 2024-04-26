package com.example.picket.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Customer {
    @Id
    @Column(name = "customer_id")
    private String id;
    @Column(name = "customer_pw", nullable=false)
    private String pass;
    @Column(name = "customer_email", nullable = false)
    private String email;
    @Column(name= "customer_name", nullable = false)
    private String name;
    @Column(name = "customer_birth", nullable = false)
    private String birthdate;
    @Column(name="customer_tel", unique = true, nullable = false)
    private String tel;
    @Column(name = "customer_point")
    private Long point;
}
