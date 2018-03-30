package com.training.strategyPattern.behaviours.fly;

import com.training.strategyPattern.behaviours.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour{

    @Override
    public String fly() {
        return "I can not fly";
    }
}
