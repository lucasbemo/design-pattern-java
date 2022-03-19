package com.lz.design.patterns.java.behavioral.strategy.duckUseCase.after;

import com.lz.design.patterns.java.behavioral.strategy.duckUseCase.after.fly.FlyNoWay;
import com.lz.design.patterns.java.behavioral.strategy.duckUseCase.after.quack.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new FlyNoWay(), new Squeak());
    }

    @Override
    public void display() {
        System.out.println("I am a rubber duck!");
    }
}
