package com.finance.frigg.repository;

import com.finance.frigg.model.Income;
import org.springframework.data.jpa.repository.JpaRepository;

import com.finance.frigg.model.ExpectedExpense;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpectedExpenseRepository extends JpaRepository<ExpectedExpense, Long>{

    ExpectedExpense findById(long id);
}
