package com.lz.design.patterns.java.behavioral.strategy.duckUseCase.after.fly;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Flying with Wigs");
    }
}
