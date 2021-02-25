package com.vsvdev.behavioral.template_method;

public class Main {
    public static void main(String[] args) {
        BaseClass plus = new Plus(1, 2);
        BaseClass minus = new Minus(1, 2);

        System.out.println(plus.getResult());
        System.out.println(minus.getResult());
    }
}