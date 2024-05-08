package com.example.picket.service;

import com.example.picket.dto.QAForm;
import com.example.picket.entity.Customer;
import com.example.picket.entity.QA;
import com.example.picket.repository.QARepository;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class QAService {

    private final QARepository qaRepository;

    public void save(QAForm dto, HttpSession session) {
        qaRepository.save(QA.builder()
                .qa_title(dto.getQa_title())
                .qa_content(dto.getQa_content())
                .write_date(dto.getWrite_date())
                .category(dto.getCategory())
                .state(dto.getState())
                .customer((Customer)session.getAttribute("customer"))
                .build()
        );
    }

    public List<QA> getAllQA(HttpSession session) {
        Customer customer = (Customer) session.getAttribute("customer");
        List<String> customerIds = Collections.singletonList(customer.getId());
        return qaRepository.findAllByCustomerIds(customerIds);
    }
}
