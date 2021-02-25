package com.vsvdev.creational.singleton.otherexample;

public class Singl {
    private static Singl singleton;
    private String message;

    private Singl() {
    }

    public static Singl instance() {
        if (singleton == null) {
            singleton = new Singl();
        }
        return singleton;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static void main(String[] args) {
        Singl.instance().setMessage("Hello");

        System.out.println(Singl.instance().getMessage());
    }
}