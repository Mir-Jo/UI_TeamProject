package com.example.picket.entity;

import com.example.picket.dto.PerformanceForm;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class Performance {
    @Id
    private String title;
    @Column(nullable = false)
    private String place;
    @Column(nullable = false) // 공연기간
    private String dates;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private Long price;
    @Column(nullable = false)
    private String url;


    public PerformanceForm toForm(){
        return new PerformanceForm(this.title, this.place, this.dates, this.category, this.price, this.url);
    }
}
