package com.training.strategyPattern.behaviours.fly;

import com.training.strategyPattern.behaviours.FlyBehaviour;

public class NormalFly implements FlyBehaviour {
    @Override
    public String fly() {
        return "Normal flying duck";
    }
}
