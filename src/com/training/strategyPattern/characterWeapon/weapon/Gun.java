package com.training.strategyPattern.characterWeapon.weapon;

public class Gun implements Weapon{
    @Override
    public String useWeapon() {
        return "Bang Bang";
    }
}
