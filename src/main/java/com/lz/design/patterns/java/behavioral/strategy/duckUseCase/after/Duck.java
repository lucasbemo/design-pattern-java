package com.lz.design.patterns.java.behavioral.strategy.duckUseCase.after;

import com.lz.design.patterns.java.behavioral.strategy.duckUseCase.after.fly.FlyBehavior;
import com.lz.design.patterns.java.behavioral.strategy.duckUseCase.after.quack.QuackBehavior;

public abstract class Duck {
    private final FlyBehavior flyBehavior;
    private final QuackBehavior quackBehavior;

    public Duck(final FlyBehavior flyBehavior, final QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();

    public void quack() {
        quackBehavior.quack();
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys.");
    }
}
