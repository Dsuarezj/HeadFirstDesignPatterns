package com.training.domain;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MallardDuckTest {
    MallardDuck duck;
    String exceptedMessage;

    @Before
    public void setUp() {
        duck = new MallardDuck();
    }

    @Test
    public void shouldReturnAllDuckFloatWhenPreformingASwimming() {
        exceptedMessage = "All ducks float";

        String swimMessage = duck.swim();

        assertThat(swimMessage, is(exceptedMessage));
    }

    @Test
    public void shouldReturnARealQuackWhenPreformingAQuack() {
        exceptedMessage = "Quacking like a real duck";

        String quackMessage = duck.quack();

        assertThat(quackMessage, is(exceptedMessage));
    }

    @Test
    public void shouldReturnAFlyingTypeWhenPreformingAFly() {
        exceptedMessage = "Normal flying duck";

        String flyMessage = duck.fly();

        assertThat(flyMessage, is(exceptedMessage));
    }
}