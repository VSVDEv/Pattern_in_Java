package com.vsvdev.behavioral.strategy;

public interface AuthStrategy {
    boolean checkLogin(String name, String password);
}

