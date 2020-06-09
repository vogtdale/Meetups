package com.meetup.repository;

import com.meetup.model.Groupe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupeDao extends JpaRepository<Groupe, Integer> {
}
