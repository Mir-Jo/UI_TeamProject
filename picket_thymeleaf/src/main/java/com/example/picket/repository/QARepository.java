package com.example.picket.repository;

import com.example.picket.entity.Customer;
import com.example.picket.entity.QA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;
import java.util.List;


public interface QARepository extends JpaRepository<QA, Long> {
    @Query("SELECT qa FROM QA qa WHERE qa.customer.id IN :customerIds")
    List<QA> findAllByCustomerIds(@Param("customerIds") List<String> customerIds);
}
