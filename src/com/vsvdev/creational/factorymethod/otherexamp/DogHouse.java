package com.vsvdev.creational.factorymethod.otherexamp;

public class DogHouse extends AnimalHouse {
    @Override
    protected Animal getAnimal() {
        return new Dog();
    }
}