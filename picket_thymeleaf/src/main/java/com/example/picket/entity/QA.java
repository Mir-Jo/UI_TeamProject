package com.example.picket.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class QA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long qa_id;
    @Column
    private String qa_title;
    @Column
    private String qa_content;
    @Column
    private Timestamp date;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private String state;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
