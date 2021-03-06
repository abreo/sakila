package com.xg.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.util.Date;

/**
 * @AUTHOR: xiaoo_gan
 * @DATE: 2016-05-20 15:59.
 * @DESCRIPTION:
 */

@JsonSerialize
@JsonNaming(PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy.class)
public class Actor implements Serializable {

    private int actorId;
    private String firstName;
    private String lastName;
    private Date lastUpdate;

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
