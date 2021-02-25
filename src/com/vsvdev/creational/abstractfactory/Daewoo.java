package com.vsvdev.creational.abstractfactory;

public class Daewoo implements Car{
    @Override
    public void drive() {
        System.out.println("Lanos drive");
    }

    @Override
    public void stop() {
        System.out.println("Lanos stopped");
    }
}
