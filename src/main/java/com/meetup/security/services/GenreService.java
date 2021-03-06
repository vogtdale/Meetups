package com.meetup.security.services;

import com.meetup.model.Genre;
import com.meetup.repository.GenreDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreService {
    @Autowired
    GenreDao genreDao;

    /*List All Genres*/


    public Genre findbyId(Integer id) {
        return this.genreDao.findById(id).get();
    }


    public List<Genre> findAll() {
        return this.genreDao.findAll();
    }

    public Genre save(Genre genre) {
        return this.genreDao.save(genre);
    }

    public void delete(Integer id) {
        this.genreDao.deleteById(id);
    }
}
