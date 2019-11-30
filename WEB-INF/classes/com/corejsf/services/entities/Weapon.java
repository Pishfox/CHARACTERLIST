package com.corejsf.services.entities;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "weapon")
public class Weapon {
    /*CREATE TABLE weapon(
	id SERIAL PRIMARY KEY,
	weaponname CHARACTER VARYING(30));
    
    доступна для записи и чтения*/

    private Long id;
    private String weaponname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWeapon() {
		return weaponname;
    }
    
    public void setWeapon(String weaponname) {
        this.weaponname = weaponname;
    }
}