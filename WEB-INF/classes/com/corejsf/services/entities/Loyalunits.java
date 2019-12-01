package com.corejsf.services.entities;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "loyalunits")
public class Loyalunits {
    /*CREATE TABLE loyalunits(
	id SERIAL PRIMARY KEY,
	char_id INTEGER REFERENCES characters (id),
	unitname CHARACTER VARYING(30),
	kind_id INTEGER REFERENCES unitkind (id));

    доступна для записи, чтения, изменения и удаления*/

    private Long id;
    private Characters character;
    private String unitname;
    private Unitkind unitkind;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Characters getCharacter() {
        return character;
    }

    public void setCharacter(Characters character) {
        this.character = character;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public Unitkind getUnitkind() {
        return unitkind;
    }

    public void setUnitkind(Unitkind unitkind) {
        this.unitkind = unitkind;
    }
}
