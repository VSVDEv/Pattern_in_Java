package com.vsvdev.behavioral.chain;

public class SystemErrLogger extends Logger {
    public SystemErrLogger() {
        super(0);
    }

    @Override
    protected void writeMsg(String msg) {
        System.err.println(this.getClass().getSimpleName() + ": " + msg);
    }
}