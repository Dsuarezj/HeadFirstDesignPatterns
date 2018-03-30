package com.training.strategyPattern.behaviours.fly;

import com.training.strategyPattern.behaviours.FlyBehaviour;

public class FlyWithRocket implements FlyBehaviour {
    @Override
    public String fly() {
        return "Rocket flying duck";
    }
}
