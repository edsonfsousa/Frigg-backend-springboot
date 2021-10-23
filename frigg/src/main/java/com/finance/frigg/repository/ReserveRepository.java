package com.finance.frigg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finance.frigg.model.Reserve;

public interface ReserveRepository extends JpaRepository<Reserve, Long>{

}
