package com.vsvdev.behavioral.visitor.withoutpattern;

public class Body implements CarElement {
    @Override
    public String getName() {
        return "body";
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