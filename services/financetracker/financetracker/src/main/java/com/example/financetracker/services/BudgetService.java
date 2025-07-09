package com.example.financetracker.services;

import com.example.financetracker.Budget;
import com.example.financetracker.repository.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetService {

    @Autowired
    private BudgetRepository budgetRepository;

    public Budget createBudget(Budget budget) {
        return budgetRepository.save(budget);
    }

    public List<Budget> getAllBudgets() {
        return budgetRepository.findAll();
    }

    public List<Budget> getBudgetsByCategory(String category) {
        return budgetRepository.findByCategory(category);
    }

    public void deleteBudget(Long id) {
        budgetRepository.deleteById(id);
    }
}

