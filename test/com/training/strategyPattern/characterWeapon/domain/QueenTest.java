package com.training.strategyPattern.characterWeapon.domain;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueenTest {

    Queen character;
    String exceptedMessage;

    @Before
    public void setUp() {
        character = new Queen();
    }

    @Test
    public void shouldReturnAllCharactersFloatWhenPreformingASwimming() {
        exceptedMessage = "Gravity is equal for all the weapons of any character";

        String dropMessage = character.dropWeapon();

        assertThat(dropMessage, is(exceptedMessage));
    }

    @Test
    public void shouldReturnARealQuackWhenPreformingAQuack() {
        exceptedMessage = "Bang Bang";

        String weaponAction = character.useWeapon();

        assertThat(weaponAction, is(exceptedMessage));
    }


}