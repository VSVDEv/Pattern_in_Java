package com.vsvdev.behavioral.iterator;

public interface Iterator<T> {
    T next();
    boolean hasNext();
}