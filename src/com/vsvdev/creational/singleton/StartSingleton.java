package com.vsvdev.creational.singleton;

public class StartSingleton {
    public static void main(String[] args) {
        System.out.println("This is basic singleton");
        BaseSingleton.getInstance().print();
        BaseSingleton.getInstance().print();
        BaseSingleton.getInstance().print();
        BaseSingleton.getInstance().stop();
        System.out.println("*********************************");
    }
}
