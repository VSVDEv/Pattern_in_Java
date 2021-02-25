package com.vsvdev.behavioral.visitor.withpattern;

public interface Service {

    void visit(Wheel element);

    void visit(Engine element);

    void visit(Body element);
}