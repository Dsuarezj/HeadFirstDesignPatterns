package com.training.strategyPattern.domain;

import com.training.strategyPattern.behaviours.FlyBehaviour;
import com.training.strategyPattern.behaviours.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public String swim() {
        return "All ducks float";
    }

    public String performQuack (){
        return quackBehaviour.quack();
    }

    public String performFly (){
        return flyBehaviour.fly();
    }
}
