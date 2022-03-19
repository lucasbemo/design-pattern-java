package com.lz.design.patterns.java.behavioral.strategy.duckUseCase.after.fly;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("It's not possible to Fly.");
    }
}
