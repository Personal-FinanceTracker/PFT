package com.example.financetracker.controller;

import com.example.financetracker.Income;
import com.example.financetracker.services.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/incomes")
public class IncomeController {

    @Autowired
    private IncomeService incomeService;

    @PostMapping("/create")  // Clearer endpoint
    public Income createIncome(@RequestBody Income income) {
        return incomeService.createIncome(income);
    }

    @GetMapping("/all")  // Clearer endpoint
    public List<Income> getAllIncomes() {
        return incomeService.getAllIncomes();
    }

    @GetMapping("/user/{userId}")
    public List<Income> getIncomesByUserId(@PathVariable Long userId) {
        return incomeService.getIncomesByUserId(userId);
    }

    @DeleteMapping("/{id}")
    public void deleteIncome(@PathVariable Long id) {
        incomeService.deleteIncome(id);
    }
}
