package com.example.financetracker;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "budgets")
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String category;

    private BigDecimal amount;

    private LocalDate startDate;

    private LocalDate endDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    // Constructors
    public Budget() {
    }

    public Budget(String category, BigDecimal amount, LocalDate startDate, LocalDate endDate) {
        this.category = category;
        this.amount = amount;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

	public void setUser(User user2) {
		// TODO Auto-generated method stub
		
	}
	public BigDecimal getAmount() {
	    return amount;
	}

	public void setAmount(BigDecimal amount) {
	    this.amount = amount;
	}

	public LocalDate getStartDate() {
	    return startDate;
	}

	public void setStartDate(LocalDate startDate) {
	    this.startDate = startDate;
	}

	public LocalDate getEndDate() {
	    return endDate;
	}

	public void setEndDate(LocalDate endDate) {
	    this.endDate = endDate;
	}

	public User getUser() {
	    return user;
	}

	

	
}