package com.example.picket.dto;

import com.example.picket.entity.FAQ;
import com.example.picket.entity.Order;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class OrderForm {
    private String faqTitle;
    private String faqCategory;
    private String faqContent;

    public Order toEntity(){ return new Order();}

}
