package com.finance.frigg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finance.frigg.model.ExpectedExpense;

public interface ExpectedExpenseRepository extends JpaRepository<ExpectedExpense, Long>{

}
