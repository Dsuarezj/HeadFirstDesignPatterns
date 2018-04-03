package com.training;

import com.training.strategyPattern.duckSimulator.behaviours.fly.FlyWithRocket;
import com.training.strategyPattern.duckSimulator.domain.Duck;
import com.training.strategyPattern.duckSimulator.domain.ModelDuck;

public class Main {

    public static void main(String[] args) {
        System.out.println("Strategy Pattern");
        Duck modelDuck = new ModelDuck();
        System.out.println(modelDuck.performFly());
        modelDuck.setFlyBehaviour(new FlyWithRocket());
        System.out.println(modelDuck.performFly());


    }
}
