package com.vsvdev.structural.facade;

public class Client {

    public static void main(String[] args) {
        // вызов без фасада
        Door door = new Door();
        door.open();

        EngineRunner runner = new EngineRunner();
        runner.fire();

        Wheel wheel = new Wheel();
        wheel.turn();


        // вызов с фасадом
        CarFacade carFacade = new CarFacade();
        carFacade.go();



    }
}
