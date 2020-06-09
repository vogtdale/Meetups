package com.meetup.security.services;

import com.meetup.model.Events;
import com.meetup.repository.EventsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventsService {

    @Autowired
    EventsDao eventsDao;

    /*List All Memebers of the a group*/

    public Events findbyId(Integer id) {
        return this.eventsDao.findById(id).get();
    }


    public List<Events> findAll() {
        return this.eventsDao.findAll();
    }

    public Events save(Events events) {
        return this.eventsDao.save(events);
    }

    public void delete(Integer id) {
        this.eventsDao.deleteById(id);
    }
}