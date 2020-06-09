package com.meetup.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Entity
@Table(name="Groups")
@EntityListeners(AuditingEntityListener.class)
public class Groupe {

    @Column(name="Groupe_Id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="TITLE", nullable = true, length = 255)
    private String title;


    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;


    @OneToMany(mappedBy = "groupe")
    @JsonIgnore
    private List<Events> evt;

    @OneToMany(mappedBy = "groupe")
    Set<UserGroupe> userGroupes;

    public Groupe() {}

    public Groupe(Integer id, String title, String description) {
        this.id = id;
        this.title = title;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public List<Events> getEvt() {
        return evt;
    }

    public void setEvt(List<Events> evt) {
        this.evt = evt;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Set<UserGroupe> getUserGroupes() {
        return userGroupes;
    }

    public void setUserGroupes(Set<UserGroupe> userGroupes) {
        this.userGroupes = userGroupes;
    }
}
