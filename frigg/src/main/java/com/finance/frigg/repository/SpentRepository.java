package com.finance.frigg.repository;

import com.finance.frigg.model.ExpectedExpense;
import org.springframework.data.jpa.repository.JpaRepository;

import com.finance.frigg.model.Spent;
import org.springframework.stereotype.Repository;

@Repository
public interface SpentRepository extends JpaRepository<Spent, Long>{

    Spent findById(long id);
}
