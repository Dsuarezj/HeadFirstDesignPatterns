package com.training.behaviours.imp;

import com.training.behaviours.QuackBehaviour;

public class Quack implements QuackBehaviour{

    @Override
    public String quack() {
        return "Quacking like a real duck";
    }
}
