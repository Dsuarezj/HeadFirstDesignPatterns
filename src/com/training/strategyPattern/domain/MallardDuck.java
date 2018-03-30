package com.training.strategyPattern.domain;

import com.training.strategyPattern.behaviours.fly.NormalFly;
import com.training.strategyPattern.behaviours.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new NormalFly();
    }


}
