package com.example.picket.service;

import com.example.picket.entity.Performance;
import com.example.picket.repository.PerformanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PerformanceService {
    private final PerformanceRepository performanceRepository;

    public Performance findInfo(String title){
        return performanceRepository.findById(title).orElse(null);
    }
}
