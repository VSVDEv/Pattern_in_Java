package com.vsvdev.creational.object_pool;

@FunctionalInterface
public interface ResourceFactory {
    Resource get();
}