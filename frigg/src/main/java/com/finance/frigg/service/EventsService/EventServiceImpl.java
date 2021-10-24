package com.finance.frigg.service.EventsService;

import com.finance.frigg.model.Event;
import com.finance.frigg.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EventServiceImpl implements EventService{

    @Autowired
    private EventRepository eventRepository;

    @Override
    public List<Event> listAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Event getEvent(long id) {
        return eventRepository.findById(id);
    }

    @Override
    public Event save(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public Event edit(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public void delete(Event event) {
        eventRepository.delete(event);
    }
}
