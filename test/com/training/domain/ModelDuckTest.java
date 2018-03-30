package com.training.domain;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ModelDuckTest {
    ModelDuck duck;
    String exceptedMessage;

    @Before
    public void setUp() {
        duck = new ModelDuck();
    }

    @Test
    public void shouldReturnAllDuckFloatWhenPreformingASwimming() {
        exceptedMessage = "All ducks float";

        String swimMessage = duck.swim();

        assertThat(swimMessage, is(exceptedMessage));
    }

    @Test
    public void shouldReturnARealQuackWhenPreformingAQuack() {
        exceptedMessage = "Squeak";

        String quackMessage = duck.performQuack();

        assertThat(quackMessage, is(exceptedMessage));
    }

    @Test
    public void shouldReturnAFlyingTypeWhenPreformingAFly() {
        exceptedMessage = "I can not fly";

        String flyMessage = duck.fly();

        assertThat(flyMessage, is(exceptedMessage));
    }

}