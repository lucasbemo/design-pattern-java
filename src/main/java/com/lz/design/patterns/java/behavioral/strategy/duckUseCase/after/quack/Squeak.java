package com.lz.design.patterns.java.behavioral.strategy.duckUseCase.after.quack;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeaking...");
    }
}
