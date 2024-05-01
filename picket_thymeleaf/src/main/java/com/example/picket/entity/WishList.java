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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "wish_id")
    @SequenceGenerator(name = "wish_id", sequenceName = "wish_id", initialValue = 1, allocationSize = 1)
    private Long wish_id;
    @ManyToOne
    @JoinColumn(name = "title", nullable = false)
    private Performance performance;
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
}
