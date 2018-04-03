package com.training.strategyPattern.duckSimulator.domain;

import com.training.strategyPattern.duckSimulator.behaviours.fly.FlyNoWay;
import com.training.strategyPattern.duckSimulator.behaviours.quack.Squeak;

public class ModelDuck extends Duck {
    public ModelDuck() {
        quackBehaviour = new Squeak();
        flyBehaviour = new FlyNoWay();
    }
}
