package com.training.strategyPattern.domain;

import com.training.strategyPattern.behaviours.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehaviour = new Quack();
    }

    public String fly() {
        return "Normal flying duck";
    }
}
