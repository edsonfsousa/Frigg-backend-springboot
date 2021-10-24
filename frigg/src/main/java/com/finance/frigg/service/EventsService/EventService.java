package com.finance.frigg.service.EventsService;

import com.finance.frigg.model.Event;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EventService {
    public List<Event> listAllEvents();

    public Event getEvent(long id);

    public Event save(Event event);

    public Event edit(Event event);

    public void delete(Event event);
}
