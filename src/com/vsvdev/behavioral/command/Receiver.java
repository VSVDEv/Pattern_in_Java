package com.vsvdev.behavioral.command;

public class Receiver {
    /**
     * action() method in Command pattern
     *
     * @param msg message to print
     */
    public void action(String msg) {
        System.out.println(msg);
    }
}