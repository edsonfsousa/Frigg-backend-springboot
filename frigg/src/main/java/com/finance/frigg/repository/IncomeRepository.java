package com.finance.frigg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finance.frigg.model.Income;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface IncomeRepository extends JpaRepository<Income, Long>{

    Income findById(long id);
}
