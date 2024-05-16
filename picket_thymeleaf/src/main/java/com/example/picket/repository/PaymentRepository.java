package com.example.picket.repository;

import com.example.picket.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, String> {

    @Query(value = "select * from payment where customer_id = :customerId",nativeQuery = true)
    List<Payment> customerPayment(String customerId);
}
