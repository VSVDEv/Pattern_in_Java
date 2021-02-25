package com.vsvdev.structural.facade;

public class CarFacade {

    private Door door = new Door();
    private EngineRunner runner = new EngineRunner();
    private Wheel wheel = new Wheel();

    public void go(){
        door.open();
        runner.fire();
        wheel.turn();
    }



}
