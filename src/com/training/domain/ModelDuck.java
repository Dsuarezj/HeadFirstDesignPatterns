package com.training.domain;

import com.training.behaviours.imp.Squeak;

public class ModelDuck extends Duck {
    public ModelDuck() {
        quackBehaviour = new Squeak();
    }

    public String fly() {
        return "I can not fly";
    }
}
