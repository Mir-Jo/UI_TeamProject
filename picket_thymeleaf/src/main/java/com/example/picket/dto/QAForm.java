package com.example.picket.dto;

import com.example.picket.entity.Customer;
import com.example.picket.entity.QA;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@ToString
public class QAForm {
    private Long qa_id;

    private String qa_title;

    private String qa_content;

    private Timestamp write_date;

    private String category;

    private String state;

    private Customer customer;


    public QA toEntity(){
        return new QA(qa_id, qa_title,qa_content, write_date, category, state, customer);
    }
}
