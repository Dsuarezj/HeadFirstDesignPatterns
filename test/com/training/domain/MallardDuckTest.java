package com.training.domain;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MallardDuckTest {
    @Test
    public void shouldReturnAllDuckFloatWhenPreformingASwimming() {
        Duck duck = new MallardDuck();
        String exceptedMessage = "All ducks float";

        String swimMessage = duck.swim();

        assertThat(swimMessage, is(exceptedMessage));
    }
}