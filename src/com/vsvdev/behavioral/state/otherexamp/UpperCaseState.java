package com.vsvdev.behavioral.state.otherexamp;

public class UpperCaseState implements State {
    @Override
    public void print(StateContext context, char letter) {
        System.out.print(String.valueOf(letter).toUpperCase());
        if (letter != ' ') {
            context.setState(new LowerCaseState());
        }
    }
}