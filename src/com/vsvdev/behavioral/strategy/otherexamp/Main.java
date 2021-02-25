package com.vsvdev.behavioral.strategy.otherexamp;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sorter<Integer> sorter = new Sorter<>(new HeapSort<>());
        sorter.sort(new ArrayList<>());
        sorter.setAlgorithm(new MergeSort<>());
        sorter.sort(new ArrayList<>());
    }
}
