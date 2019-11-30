package com.corejsf.services.entities;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "skills")
public class Skills {
    /*CREATE TABLE skills(
	id SERIAL PRIMARY KEY,
	skillname CHARACTER VARYING(30),
	type CHARACTER VARYING(30));
    
    доступна для записи и чтения*/

    private Long id;
    private String skillname;
    private String type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSkillname() {
		return skillname;
    }

    public void setSkillname(String skillname) {
        this.skillname = skillname;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}