package com.training.domain;

import com.training.behaviours.imp.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehaviour = new Quack();
    }

    public String fly() {
        return "Normal flying duck";
    }
}
