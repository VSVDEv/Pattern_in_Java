package com.vsvdev.behavioral.template_method;

public class Minus extends BaseClass {
    public Minus(int a, int b) {
        super(a, b);
    }

    @Override
    protected int apply(int a, int b) {
        return a - b;
    }
}