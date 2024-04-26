package com.example.picket.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;

import java.sql.Date;
import java.sql.Timestamp;

@Controller
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Order {
    @Id
    private String ticket_id;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @Column(nullable = false)
    private Date perform_date;
    @Column(nullable = false)
    private Timestamp pay_date;
    @Column(nullable = false)
    private Date cancel_date;
}
