package com.training.strategyPattern.characterWeapon.weapon;

public class Knife implements Weapon{

    @Override
    public String useWeapon() {
        return "cut cut cut";
    }
}
