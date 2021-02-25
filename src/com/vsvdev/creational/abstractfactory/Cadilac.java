package com.vsvdev.creational.abstractfactory;

public class Cadilac implements Car{
    @Override
    public void drive() {
        System.out.println("Drive speed 150 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stopped at 1 sec");
    }
}
