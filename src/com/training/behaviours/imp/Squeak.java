package com.training.behaviours.imp;

import com.training.behaviours.QuackBehaviour;

public class Squeak implements QuackBehaviour{
    @Override
    public String quack() {
        return "Squeak";
    }
}
