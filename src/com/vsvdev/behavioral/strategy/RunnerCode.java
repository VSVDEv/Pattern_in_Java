package com.vsvdev.behavioral.strategy;

import java.io.File;

public class RunnerCode {
    public static void main(String[] args) {
        UserChecker userChecker = new UserChecker();

        userChecker.check(new DBAuth("jdbc://etc"));

        userChecker.check(new FileAuth(new File("c:\\file.txt")));

    }
}
