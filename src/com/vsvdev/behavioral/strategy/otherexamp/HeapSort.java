package com.vsvdev.behavioral.strategy.otherexamp;

import java.util.List;

public class HeapSort<T> implements Algorithm<T> {
    @Override
    public void sort(List<T> list) {
        System.out.println("Heap sort");
    }
}