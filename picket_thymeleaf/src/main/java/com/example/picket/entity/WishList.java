package com.example.picket.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class WishList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long wish_id;
    @ManyToOne
    @JoinColumn(name = "title")
    private Performance performance;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
