package com.finance.frigg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finance.frigg.model.Income;

public interface IncomeRepository extends JpaRepository<Income, Long>{

}
