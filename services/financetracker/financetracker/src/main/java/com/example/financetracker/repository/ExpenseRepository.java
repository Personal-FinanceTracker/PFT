package com.example.financetracker.repository;

import com.example.financetracker.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    // ✅ Corrected method name
    List<Expense> findByUserId(Long userId);
}
