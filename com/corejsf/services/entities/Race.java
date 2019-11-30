package com.corejsf.services.entities;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "race")
public class Race {
    /*CREATE TABLE race(
	id SERIAL PRIMARY KEY,
	racename CHARACTER VARYING(30),
    racedesc CHARACTER VARYING(300));
    
    доступна для записи и чтения*/

    private Long id;
    private String racename;
    private String racedesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRacename() {
		return racename;
    }

    public void setRacename(String racename) {
        this.racename = racename;
    }
    
    public String getRacedesc() {
        return racedesc;
    }

    public void setRacedesc(String racedesc) {
        this.racedesc = racedesc;
    }
}