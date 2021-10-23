package com.finance.frigg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finance.frigg.model.Event;

public interface EventRepository extends JpaRepository<Event, Long>{
	
}
