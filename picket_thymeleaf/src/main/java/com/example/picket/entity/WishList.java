package com.example.picket.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@IdClass(WishCompositeKey.class)
public class WishList {
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "wish_id")
//    @SequenceGenerator(name = "wish_id", sequenceName = "wish_id", initialValue = 1, allocationSize = 1)
//    private Long wish_id;
    @Id
    @ManyToOne
    @JoinColumn(name = "title", nullable = false)
    private Performance performance;
    @Id
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
}
