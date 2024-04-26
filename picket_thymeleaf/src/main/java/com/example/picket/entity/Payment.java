package com.example.picket.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
public class Payment {
    @Id
    private String ticket_id;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @Column(nullable = false)
    private Date perform_date;
    @Column(nullable = false)
    private LocalDateTime pay_date;
    @Column(nullable = false)
    private Date cancel_date;
}
