package com.example.financetracker;


//import java.util.List;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//
//@Entity
//public class User {
//  @Id @GeneratedValue Long id;
//  private String name, email, password;
//
//  @OneToMany(mappedBy="user", cascade = CascadeType.ALL, orphanRemoval=true)
//  private List<Expense> expenses = new ArrayList<>();
//
//  @OneToMany(mappedBy="user", cascade = CascadeType.ALL, orphanRemoval=true)
//  private List<Income> incomes = new ArrayList<>();
//}




import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, unique = true, length = 150)
    private String email;

    @Column(nullable = false)
    private String password;
    

    @OneToMany(
        mappedBy = "user",
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private List<Expense> expenses = new ArrayList<>();

    @OneToMany(
        mappedBy = "user",
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private List<Income> incomes = new ArrayList<>();

    @OneToMany(
        mappedBy = "user",
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private List<Budget> budgets = new ArrayList<>();

    // Constructors
    public User() {}

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Getters and setters (or use Lombok @Getter/@Setter)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public List<Expense> getExpenses() { return expenses; }
    public void setExpenses(List<Expense> expenses) { this.expenses = expenses; }

    public List<Income> getIncomes() { return incomes; }
    public void setIncomes(List<Income> incomes) { this.incomes = incomes; }

    public List<Budget> getBudgets() { return budgets; }
    public void setBudgets(List<Budget> budgets) { this.budgets = budgets; }

    // Utility helpers
    public void addExpense(Expense expense) {
        expenses.add(expense);
        expense.setUser(this);
    }

    public void removeExpense(Expense expense) {
        expenses.remove(expense);
        expense.setUser(null);
    }

    public void addIncome(Income income) {
        incomes.add(income);
        income.setUser(this);
    }

    public void removeIncome(Income income) {
        incomes.remove(income);
        income.setUser(null);
    }

    public void addBudget(Budget budget) {
        budgets.add(budget);
        budget.setUser(this);
    }

    public void removeBudget(Budget budget) {
        budgets.remove(budget);
        budget.setUser(null);
    }
}
