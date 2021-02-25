package com.vsvdev.structural.facade.otherexamp;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
//import com.google.common.collect.Collections2;

/**
 *
 *    <dependency>
 *             <groupId>com.google.guava</groupId>
 *             <artifactId>guava</artifactId>
 *             <version>21.0</version>
 *         </dependency>
 */
public class CollectionFacadeImpl implements CollectionsFacade {
    @Override
    public <T extends Comparable<? super T>> void sort(List<T> list) {
        Collections.sort(list);
    }

    @Override
    public <T> Collection<List<T>> getPermutations(List<T> list) {
    //    return Collections2.permutations(list);
        return null;
    }
}
