package com.example.picket.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class Performance {
    @Id
    @Column
    private String title;
    @Column(nullable = false)
    private String place;
    @Column(nullable = false)
    private String dates;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private Long price;
}
