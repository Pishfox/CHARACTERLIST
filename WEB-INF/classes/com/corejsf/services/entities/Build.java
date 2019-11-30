package com.corejsf.services.entities;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "build")
public class Build {
    /*CREATE TABLE build(
	id SERIAL PRIMARY KEY,
	char_id INTEGER REFERENCES characters (id),
	skill_id INTEGER REFERENCES skills (id),
	weapon_id INTEGER REFERENCES weapon (id));
    
    доступна для записи, чтения, изменения и удаления*/

    private Long id;
    private Characters character;
    private Skills skill;
    private Weapon weapon;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Characters getCharacters() {
		return character;
    }

    public void setCharacters(Characters character) {
        this.character = character;
    }

    public Skills getSkills() {
        return skill;
    }

    public void setSkills(Skills skill) {
        this.skill = skill;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}