package com.lz.design.patterns.java.behavioral.strategy.duckUseCase.before;

public abstract class Duck {

    public abstract void display();

    public void quack() {
        System.out.println("Make a quack sound");
    }

    public void swim() {
        System.out.println("swim");
    }

    public void fly() {
        System.out.println("fling..");
    }
}
