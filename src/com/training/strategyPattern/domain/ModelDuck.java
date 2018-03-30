package com.training.strategyPattern.domain;

import com.training.strategyPattern.behaviours.fly.FlyNoWay;
import com.training.strategyPattern.behaviours.quack.Squeak;

public class ModelDuck extends Duck {
    public ModelDuck() {
        quackBehaviour = new Squeak();
        flyBehaviour = new FlyNoWay();
    }
}
