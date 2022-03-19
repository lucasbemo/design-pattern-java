package com.lz.design.patterns.java.behavioral.strategy.duckUseCase.after;

import com.lz.design.patterns.java.behavioral.strategy.duckUseCase.after.fly.FlyWithWings;
import com.lz.design.patterns.java.behavioral.strategy.duckUseCase.after.quack.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I am a wild duck!");
    }
}
