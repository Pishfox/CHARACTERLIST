package com.corejsf.services.entities;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "characters")
public class Characters {
    /*CREATE TABLE characters(
	id SERIAL PRIMARY KEY,
	firstname CHARACTER VARYING(30),
	lastname CHARACTER VARYING(30),
	race_id INTEGER REFERENCES race (id),
	age INTEGER,
	alignment_id INTEGER REFERENCES alignment (id),
	homeworld_id INTEGER REFERENCES homeworld (id),
	tagline CHARACTER VARYING(300),
	avatar BYTEA;
    
    доступна для записи, чтения, изменения и удаления*/

    private Long id;
    private String firstname;
    private String lastname;
    private Race race;
    private Long age;
    private Alignment alignment;
    private Homeworld homeworld;
    private String tagline;
    //private ??? avatar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
		return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public Homeworld getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(Homeworld homeworld) {
        this.homeworld = homeworld;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }
}
