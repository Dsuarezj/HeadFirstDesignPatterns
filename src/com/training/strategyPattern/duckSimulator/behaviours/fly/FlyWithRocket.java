package com.training.strategyPattern.duckSimulator.behaviours.fly;

import com.training.strategyPattern.duckSimulator.behaviours.FlyBehaviour;

public class FlyWithRocket implements FlyBehaviour {
    @Override
    public String fly() {
        return "Rocket flying duck";
    }
}
