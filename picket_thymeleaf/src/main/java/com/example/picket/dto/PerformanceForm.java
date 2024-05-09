package com.example.picket.dto;

import com.example.picket.entity.Performance;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class PerformanceForm {
//    private Long id;
    private String title;
    private String place;
    private String dates;
    private String category;
    private Long price;

    public Performance toEntity() {
        return new Performance(title,place,dates,category,price);}
}
