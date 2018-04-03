package com.training.strategyPattern.duckSimulator.behaviours.fly;

import com.training.strategyPattern.duckSimulator.behaviours.FlyBehaviour;

public class NormalFly implements FlyBehaviour {
    @Override
    public String fly() {
        return "Normal flying duck";
    }
}
