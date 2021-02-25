package com.vsvdev.behavioral.visitor.withoutpattern;

public class Engine implements CarElement {
    @Override
    public String getName() {
        return "engine";
    }

    @Override
    public void doWash() {
        System.out.println("Washing: " + this.getName());
    }

    @Override
    public void doRepair() {
        System.out.println("Repairing: " + this.getName());
    }


}