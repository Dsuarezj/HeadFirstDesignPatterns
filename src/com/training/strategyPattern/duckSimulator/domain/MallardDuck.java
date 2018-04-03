package com.training.strategyPattern.duckSimulator.domain;

import com.training.strategyPattern.duckSimulator.behaviours.fly.NormalFly;
import com.training.strategyPattern.duckSimulator.behaviours.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new NormalFly();
    }


}
