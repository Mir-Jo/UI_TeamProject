package com.example.picket.entity;

import jakarta.persistence.*;
import jakarta.servlet.http.HttpSession;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
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
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Customer customer;

    @Builder
    public QA(Long id, String qa_title, String qa_content, Timestamp write_date, String category, String state, Customer customer){
        this.qa_id = id;
        this.qa_title = qa_title;
        this.qa_content = qa_content;
        this.write_date = (write_date != null) ? write_date : Timestamp.valueOf(LocalDateTime.now());
        this.category = category;
        this.state = (state != null) ? state : "답변 대기중";
        this.customer = customer;
    }

}
