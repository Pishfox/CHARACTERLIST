package com.corejsf.services.entities;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "alignment")
public class Alignment {
    /*CREATE TABLE alignment (
	id SERIAL PRIMARY KEY,
    alignname CHARACTER VARYING(30));
    
    только для чтения*/

    private Long id;
    private String alignname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlignname() {
		return alignname;
    }
    
    public void setAlignname(String alignname) {
        this.alignname = alignname;
    }
}