package com.vsvdev.structural.proxy;

public class SubjectImpl implements Subject {
    @Override
    public void doIt() {
        System.out.println("Done");
    }
}