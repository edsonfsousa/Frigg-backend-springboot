package com.finance.frigg.repository;

import com.finance.frigg.model.Income;
import org.springframework.data.jpa.repository.JpaRepository;

import com.finance.frigg.model.Reserve;
import org.springframework.stereotype.Repository;

@Repository
public interface ReserveRepository extends JpaRepository<Reserve, Long>{

    Reserve findById(long id);
}
