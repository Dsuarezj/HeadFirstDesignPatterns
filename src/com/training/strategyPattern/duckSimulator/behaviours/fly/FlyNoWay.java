package com.training.strategyPattern.duckSimulator.behaviours.fly;

import com.training.strategyPattern.duckSimulator.behaviours.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour{

    @Override
    public String fly() {
        return "I can not fly";
    }
}
