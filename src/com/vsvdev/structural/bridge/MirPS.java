package com.vsvdev.structural.bridge;

public class MirPS implements PaymentSystem {
    @Override
    public void printName() {
        System.out.println("Mir");
    }
}