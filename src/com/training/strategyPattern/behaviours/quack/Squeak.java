package com.training.strategyPattern.behaviours.quack;

import com.training.strategyPattern.behaviours.QuackBehaviour;

public class Squeak implements QuackBehaviour {
    @Override
    public String quack() {
        return "Squeak";
    }
}
