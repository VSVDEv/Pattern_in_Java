package com.vsvdev.creational.factorymethod.otherexamp;

public abstract class AnimalHouse {
    private final Animal animal;

    protected AnimalHouse() {
        //build a house
        //add a bowl
        //add toys

        //create an animal
        animal = getAnimal();
        animal.makeSound();
    }


    protected abstract Animal getAnimal();
}