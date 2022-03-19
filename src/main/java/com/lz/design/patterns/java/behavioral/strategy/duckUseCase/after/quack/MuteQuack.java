package com.lz.design.patterns.java.behavioral.strategy.duckUseCase.after.quack;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("It's not possible to Quack.");
    }
}
