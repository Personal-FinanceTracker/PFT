package com.example.financetracker.repository;

import com.example.financetracker.Budget;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
    List<Budget> findByCategory(String category);  // ✅ Correct
}