package com.meetup.security.services;


import com.meetup.model.Groupe;
import com.meetup.repository.GroupeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupeService {

    @Autowired
    GroupeDao groupeDao;

    /*List ts les group*/

    public Groupe findGroupes(Integer id) {
        return this.groupeDao.findById(id).get();
    }


    public List<Groupe> findAll() {
        return this.groupeDao.findAll();
    }

    public Groupe save(Groupe events) {
        return this.groupeDao.save(events);
    }

    public void delete(Integer id) {
        this.groupeDao.deleteById(id);
    }
}
