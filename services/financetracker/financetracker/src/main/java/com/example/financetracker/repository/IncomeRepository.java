package com.example.financetracker.repository;



import com.example.financetracker.Income;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IncomeRepository extends JpaRepository<Income, Long> {

    // Get all incomes for a specific user
    List<Income> findByUserId(Long userId);

    // Optional: Get incomes in a date range
    List<Income> findByDateBetween(java.time.LocalDate startDate, java.time.LocalDate endDate);
}
