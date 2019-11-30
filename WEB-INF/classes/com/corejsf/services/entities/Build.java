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
    private Characters character; //classes\com\corejsf\services\entities\Build.java:16: error: cannot find symbol class Characters
    private Skills skill; //classes\com\corejsf\services\entities\Build.java:17: error: cannot find symbol class Skills
    private Weapon weapon; //classes\com\corejsf\services\entities\Build.java:18: error: cannot find symbol class Weapon

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Characters getCharacters() {
		return character;
    } //classes\com\corejsf\services\entities\Build.java:28: error: cannot find symbol class Characters

    public void setCharacters(Characters character) {
        this.character = character;
    } //classes\com\corejsf\services\entities\Build.java:32: error: cannot find symbol class Characters

    public Skills getSkills() {
        return skill;
    } //classes\com\corejsf\services\entities\Build.java:36: error: cannot find symbol class Skills

    public void setSkills(Skills skill) {
        this.skill = skill;
    } //classes\com\corejsf\services\entities\Build.java:40: error: cannot find symbol class Skills

    public Weapon getWeapon() {
        return weapon;
    } //classes\com\corejsf\services\entities\Build.java:44: error: cannot find symbol class Weapon

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    } //classes\com\corejsf\services\entities\Build.java:48: error: cannot find symbol class Weapon
}
