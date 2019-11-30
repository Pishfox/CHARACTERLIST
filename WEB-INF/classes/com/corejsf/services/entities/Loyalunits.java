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
    private Characters character; //classes\com\corejsf\services\entities\Loyalunits.java:16: error: cannot find symbol class Characters
    private String unitname;
    private Unitkind unitkind; //classes\com\corejsf\services\entities\Loyalunits.java:18: error: cannot find symbol class Unitkind

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Characters getCharacter() {
        return character;
    } //classes\com\corejsf\services\entities\Loyalunits.java:28: error: cannot find symbol class Characters

    public void setCharacter(Characters character) {
        this.character = character;
    } //classes\com\corejsf\services\entities\Loyalunits.java:32: error: cannot find symbol class Characters

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public Unitkind getUnitkind() {
        return unitkind;
    } //classes\com\corejsf\services\entities\Loyalunits.java:44: error: cannot find symbol class Unitkind

    public void setUnitkind(Unitkind unitkind) {
        this.unitkind = unitkind;
    } //classes\com\corejsf\services\entities\Loyalunits.java:48: error: cannot find symbol class Unitkind
}
