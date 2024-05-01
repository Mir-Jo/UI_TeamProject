package com.example.picket.dto;

import com.example.picket.entity.Customer;
import com.example.picket.entity.Payment;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@AllArgsConstructor
@ToString
public class PaymentForm {
    private String ticket_id;
    private Customer customer;
    private Date perform_date;
    private Timestamp pay_date;
    private Date cancel_date;

    public Payment toEntity(){ return new Payment(ticket_id,customer ,perform_date,pay_date,cancel_date);}

}
