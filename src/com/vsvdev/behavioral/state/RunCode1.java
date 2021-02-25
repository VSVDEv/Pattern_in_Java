package com.vsvdev.behavioral.state;

public class RunCode1 {
    public static void main(String[] args) {

        TransformerContext context = new TransformerContext();

        TransformerState stateMove = new MoveState();
        TransformerState stateFire = new FireState();

        context.setState(stateFire);
        context.action();

        context.setState(stateMove);
        context.action();

    }
}
