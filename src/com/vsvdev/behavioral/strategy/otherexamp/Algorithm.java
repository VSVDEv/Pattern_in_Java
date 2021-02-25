package com.vsvdev.behavioral.strategy.otherexamp;

import java.util.List;

public interface Algorithm<T> {
    void sort(List<T> list);
}