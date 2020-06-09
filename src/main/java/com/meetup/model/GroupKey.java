package com.meetup.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class GroupKey implements Serializable {
    @Column(name = "user_id")
    Long UserId;

    @Column(name = "groupe_id")
    Integer groupe_id;

    public GroupKey() {}

    public GroupKey(Long userId, Integer groupe_id) {
        UserId = userId;
        this.groupe_id = groupe_id;
    }

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }

    public Integer getGroupe_id() {
        return groupe_id;
    }

    public void setGroupe_id(Integer groupe_id) {
        this.groupe_id = groupe_id;
    }


}
