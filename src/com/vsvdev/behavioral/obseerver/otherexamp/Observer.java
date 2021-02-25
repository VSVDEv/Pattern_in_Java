package com.vsvdev.behavioral.obseerver.otherexamp;

@FunctionalInterface
public interface Observer {
    void notify(Event event);
}