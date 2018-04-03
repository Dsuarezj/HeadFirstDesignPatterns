package com.training.strategyPattern.duckSimulator.domain;

import com.training.strategyPattern.duckSimulator.behaviours.FlyBehaviour;
import com.training.strategyPattern.duckSimulator.behaviours.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public String swim() {
        return "All ducks float";
    }

    public String performQuack() {
        return quackBehaviour.quack();
    }

    public String performFly() {
        return flyBehaviour.fly();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }
}
