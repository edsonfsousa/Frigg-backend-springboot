package com.finance.frigg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finance.frigg.model.Spent;

public interface SpentRepository extends JpaRepository<Spent, Long>{

}
