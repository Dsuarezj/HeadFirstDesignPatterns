package com.training.strategyPattern.duckSimulator.behaviours.quack;

import com.training.strategyPattern.duckSimulator.behaviours.QuackBehaviour;

public class Quack implements QuackBehaviour {

    @Override
    public String quack() {
        return "Quacking like a real duck";
    }
}
