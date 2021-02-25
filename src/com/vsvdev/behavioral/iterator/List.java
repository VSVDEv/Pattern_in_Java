package com.vsvdev.behavioral.iterator;

public class List<T> implements Iterable<T> {
    private final T[] array;

    @SafeVarargs
    public List(T... array) {
        this.array = array;
    }

    @Override
    public Iterator<T> getIterator() {
        return new Iterator<T>() {
            int index = 0;

            @Override
            public T next() {
                T element = array[index];
                index++;
                return element;
            }

            @Override
            public boolean hasNext() {
                return index < array.length;
            }
        };
    }
}
