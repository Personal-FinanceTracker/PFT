package com.example.financetracker.services;

import com.example.financetracker.Expense;
import com.example.financetracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expensesRepository;

    public Expense createExpense(Expense expense) {
        return expensesRepository.save(expense);
    }

    public List<Expense> getAllExpenses() {
        return expensesRepository.findAll();
    }

    public List<Expense> getExpensesByUserId(Long userId) {
        return expensesRepository.findByUserId(userId);
    }

    public void deleteExpense(Long id) {
        expensesRepository.deleteById(id);
    }
}
