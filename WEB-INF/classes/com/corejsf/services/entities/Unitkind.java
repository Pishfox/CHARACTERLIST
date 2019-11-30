package com.corejsf.services.entities;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "unitkind")
public class Unitkind {
    /*CREATE TABLE unitkind(
	id SERIAL PRIMARY KEY,
	kindname CHARACTER VARYING(30),
	kinddesc CHARACTER VARYING(300));
    
    доступна для записи и чтения*/

    private Long id;
    private String kindname;
    private String kinddesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKindname() {
		return kindname;
    }

    public void setKindname(String kindname) {
        this.kindname = kindname;
    }

    public String getKinddesc() {
        return kinddesc;
    }

    public void setKinddesc(String kinddesc) {
        this.kinddesc = kinddesc;
    }
}