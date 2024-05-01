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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "qa_id")
    @SequenceGenerator(name = "qa_id", sequenceName = "qa_id", initialValue = 1, allocationSize = 1)
    private Long qa_id;
    @Column(nullable = false)
    private String qa_title;
    @Column(nullable = false)
    private String qa_content;
    @Column(nullable = false)
    private Timestamp write_date;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private String state;
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
}
