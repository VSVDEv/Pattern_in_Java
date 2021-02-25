package com.vsvdev.behavioral.visitor.withpattern;

public interface CarElement {
    String getName();

    /**
     * Method accept in the Visitor pattern
     *
     * @param visitor to visit the element
     */
    void accept(Service visitor);
}