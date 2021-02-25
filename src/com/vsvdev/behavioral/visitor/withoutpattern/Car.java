package com.vsvdev.behavioral.visitor.withoutpattern;



import java.util.Arrays;

@SuppressWarnings("WeakerAccess")
public class Car {
    private final Body body;
    private final Engine engine;
    private final Wheel[] wheels;

    public Car() {
        engine = new Engine();
        body = new Body();
        wheels = new com.vsvdev.behavioral.visitor.withoutpattern.Wheel[4];
        Arrays.fill(wheels, new Wheel());
    }

    public void doRepair() {
        body.doRepair();
        engine.doRepair();
        for (Wheel wheel : wheels) {
            wheel.doRepair();
        }
    }

    public void doWash() {
        body.doWash();
        engine.doWash();
        for (Wheel wheel : wheels) {
            wheel.doWash();
        }
    }

    public void doTO() {
        body.doWash();
        engine.doWash();
        for (Wheel wheel : wheels) {
            wheel.doWash();
        }
    }
}