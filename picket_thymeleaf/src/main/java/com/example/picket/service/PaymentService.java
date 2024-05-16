package com.example.picket.service;

import com.example.picket.dto.DoPaymentForm;
import com.example.picket.entity.Customer;
import com.example.picket.entity.Payment;
import com.example.picket.entity.Ticket;
import com.example.picket.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Service
@RequiredArgsConstructor
public class PaymentService {
    private final PaymentRepository paymentRepository;

    public void paymentInfoInput(List<Ticket> tickets, Customer customer, DoPaymentForm doPaymentForm){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일", Locale.KOREA);
        LocalDate performDate = LocalDate.parse(doPaymentForm.getPerformDate(), formatter);
        LocalDate payDate = LocalDate.parse(doPaymentForm.getPayDate(), formatter);
        

        for(Ticket ticket: tickets){
            paymentRepository.save(new Payment(ticket.getTicket_id(), customer, performDate, payDate, performDate.minusDays(5)));
        }
    }
}
