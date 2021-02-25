package com.vsvdev.creational.factorymethod.otherexamp;

public class CatsHouse extends AnimalHouse {
    @Override
    protected Animal getAnimal() {
        return new Cat();
    }
}