package com.lz.design.patterns.java.behavioral.strategy.duckUseCase.before;

public class Principal {
    public static void main(String[] args) {
        System.out.println("----------------------");
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.quack();
        mallardDuck.fly();

        System.out.println("----------------------");

        Duck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.quack();
        redheadDuck.fly();

        System.out.println("----------------------");

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        redheadDuck.quack();
        redheadDuck.fly();//Error, rubber duck don't fly.
    }
}
