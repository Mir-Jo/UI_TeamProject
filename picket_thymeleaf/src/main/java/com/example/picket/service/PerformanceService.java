package com.example.picket.service;

import com.example.picket.dto.PerformanceForm;
import com.example.picket.entity.Performance;
import com.example.picket.repository.PerformanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
@RequiredArgsConstructor
public class  PerformanceService {
    private final PerformanceRepository performanceRepository;

    public PerformanceForm findInfo(String title){
        Performance performance = performanceRepository.findById(title).orElse(null);

        return performance != null ? performance.toForm() : null;
    }


    public void toModel(PerformanceForm performanceForm, Model model){

        model.addAttribute("title", performanceForm.getTitle());
        model.addAttribute("place", performanceForm.getPlace());
        model.addAttribute("dates", performanceForm.getDates());
        model.addAttribute("category", performanceForm.getCategory());
        model.addAttribute("price", performanceForm.getPrice());
    }
}
