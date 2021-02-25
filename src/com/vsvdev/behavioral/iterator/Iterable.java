package com.vsvdev.behavioral.iterator;

public interface Iterable<T> {
    Iterator<T> getIterator();
}