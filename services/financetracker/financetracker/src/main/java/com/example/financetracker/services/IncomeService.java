
package com.example.financetracker.services;

import com.example.financetracker.Income;
import com.example.financetracker.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncomeService {

    @Autowired
    private IncomeRepository incomeRepository;

    public Income createIncome(Income income) {
        return incomeRepository.save(income);
    }

    public List<Income> getAllIncomes() {
        return incomeRepository.findAll();
    }

    public List<Income> getIncomesByUserId(Long userId) {
        return incomeRepository.findByUserId(userId);
    }

    public void deleteIncome(Long id) {
        incomeRepository.deleteById(id);
    }
}

