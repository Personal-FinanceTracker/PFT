package com.example.financetracker.controller;

import com.example.financetracker.Budget;
import com.example.financetracker.services.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/budgets")
public class BudgetController {

    @Autowired
    private BudgetService budgetService;

    @PostMapping("/create")  // Updated endpoint for clarity
    public Budget createBudget(@RequestBody Budget budget) {
        return budgetService.createBudget(budget);
    }

    @GetMapping("/all")  // Updated endpoint for clarity
    public List<Budget> getAllBudgets() {
        return budgetService.getAllBudgets();
    }

    @GetMapping("/category/{category}")  // Get budgets by category name
    public List<Budget> getBudgetsByCategory(@PathVariable String category) {
        return budgetService.getBudgetsByCategory(category);
    }

    @DeleteMapping("/{id}")
    public void deleteBudget(@PathVariable Long id) {
        budgetService.deleteBudget(id);
    }
}
