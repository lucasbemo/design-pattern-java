package com.lz.design.patterns.java.behavioral.strategy.duckUseCase.after;

import com.lz.design.patterns.java.behavioral.strategy.duckUseCase.after.fly.FlyWithWings;
import com.lz.design.patterns.java.behavioral.strategy.duckUseCase.after.quack.MuteQuack;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        super(new FlyWithWings(), new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("I am a Red Head Duck!");
    }
}
