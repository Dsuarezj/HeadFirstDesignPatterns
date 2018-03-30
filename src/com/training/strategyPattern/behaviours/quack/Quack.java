package com.training.strategyPattern.behaviours.quack;

import com.training.strategyPattern.behaviours.QuackBehaviour;

public class Quack implements QuackBehaviour {

    @Override
    public String quack() {
        return "Quacking like a real duck";
    }
}
