package com.training.strategyPattern.duckSimulator.behaviours.quack;

import com.training.strategyPattern.duckSimulator.behaviours.QuackBehaviour;

public class Squeak implements QuackBehaviour {
    @Override
    public String quack() {
        return "Squeak";
    }
}
