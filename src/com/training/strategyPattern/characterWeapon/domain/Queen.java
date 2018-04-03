package com.training.strategyPattern.characterWeapon.domain;

import com.training.strategyPattern.characterWeapon.weapon.Gun;

public class Queen extends Character {
    public Queen() {
        weapon = new Gun();
    }
}
