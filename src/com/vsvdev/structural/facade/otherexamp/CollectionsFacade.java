package com.vsvdev.structural.facade.otherexamp;

import java.util.Collection;
import java.util.List;

public interface CollectionsFacade {

    <T extends Comparable<? super T>> void sort(List<T> list);

    <T> Collection<List<T>> getPermutations(List<T> list);
}
