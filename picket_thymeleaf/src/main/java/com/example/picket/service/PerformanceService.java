package com.example.picket.service;

import com.example.picket.dto.PerformanceForm;
import com.example.picket.entity.Performance;
import com.example.picket.repository.PerformanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PerformanceService {
    private final PerformanceRepository performanceRepository;

    public PerformanceForm findInfo(String title){
        return performanceRepository.findByTitle(title).toForm();
    }
}
