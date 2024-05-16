package com.example.picket.repository;

import com.example.picket.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, String> {
    @Override
    Optional<Customer> findById(String id);
    Optional<Customer> findByTel(String tel);

    @Modifying
    @Query(value = "update customer set customer_point = :updatePoint where customer_id = :customerId", nativeQuery = true)
    void updatePoint(Long updatePoint, String customerId);
}