package com.example.picket.dto;

import com.example.picket.entity.Customer;
import com.example.picket.entity.Performance;
import com.example.picket.entity.WishList;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class WishListForm {
    private Long wish_id;
    private Performance performance;
    private Customer customer;

    public WishList toEntity() { return new WishList(wish_id, performance,customer);}
}