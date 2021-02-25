package com.vsvdev.behavioral.obseerver.otherexamp;



public class ErrObserver implements Observer {
    @Override
    public void notify(Event event) {
        System.err.println(event.getClass());
    }
}