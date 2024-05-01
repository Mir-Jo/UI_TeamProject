package com.example.picket.repository;

import com.example.picket.entity.Performance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PerformanceRepository extends JpaRepository<Performance, String> {

    @Query(value = "select * from performance where title = :title", nativeQuery = true)
    Performance findByTitle(String title);
}
