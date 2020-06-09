package com.meetup.repository;

import com.meetup.model.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventsDao  extends JpaRepository<Events, Integer> {
}
