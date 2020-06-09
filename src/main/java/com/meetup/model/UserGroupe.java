package com.meetup.model;

import javax.persistence.*;

@Entity
public class UserGroupe {

    //Creation d'une cle composite sur user et groupe manytoOne relation

    @EmbeddedId
    GroupKey id;

    @ManyToOne
    @MapsId("user_id")
    @JoinColumn(name = "user_id")
    User user;

    @ManyToOne
    @MapsId("groupe_id")
    @JoinColumn(name = "groupe_id")
    Groupe groupe;


    public UserGroupe(GroupKey id) {
        this.id = id;
    }

    public GroupKey getId() {
        return id;
    }

    public void setId(GroupKey id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

}
