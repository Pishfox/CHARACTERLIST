package com.corejsf.services.entities;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "homeworld")
public class Homeworld {
    /*CREATE TABLE homeworld(
	id SERIAL PRIMARY KEY,
	worldname CHARACTER VARYING(30),
	worlddesc CHARACTER VARYING(300));
    
    доступна для записи и чтения*/

    private Long id;
    private String worldname;
    private String worlddesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWorldname() {
		return worldname;
    }

    public void setWorldname(String worldname) {
        this.worldname = worldname;
    }
    
    public String getWorlddesc() {
        return worlddesc;
    }

    public void setWorlddesc(String worlddesc) {
        this.worlddesc = worlddesc;
    }
}