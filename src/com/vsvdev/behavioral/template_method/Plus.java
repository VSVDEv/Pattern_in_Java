package com.vsvdev.behavioral.template_method;

public class Plus extends BaseClass {

    public Plus(int a, int b) {
        super(a, b);
    }

    @Override
    protected int apply(int a, int b) {
        return a + b;
    }
}
