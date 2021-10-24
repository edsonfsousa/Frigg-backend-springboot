package com.finance.frigg.repository;

import com.finance.frigg.model.ExpectedExpense;
import org.springframework.data.jpa.repository.JpaRepository;

import com.finance.frigg.model.Event;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long>{

    Event findById(long id);
}
