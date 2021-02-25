package com.vsvdev.creational.singleton;

public class BaseSingleton {

    private static BaseSingleton instance;

    public static BaseSingleton getInstance() {
        if (instance==null) {
            instance = new BaseSingleton();
        }
        return instance;
    }

    private BaseSingleton() {
    }

    public void print(){
        System.out.println(this);
    }

    public void stop(){
        System.out.println("stop");
    }

}