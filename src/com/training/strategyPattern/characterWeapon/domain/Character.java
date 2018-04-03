package com.training.strategyPattern.characterWeapon.domain;

import com.training.strategyPattern.characterWeapon.weapon.Weapon;

public abstract class Character {

    Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String useWeapon(){
        return weapon.useWeapon();
    }

    public String dropWeapon(){
        return "Gravity is equal for all the weapons of any character";
    }
}
