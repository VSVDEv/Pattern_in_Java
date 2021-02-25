package com.vsvdev.creational.abstractfactory;


// американские транспортные средства
public class USAFactory implements TransportFactory{

    @Override
    public Car createCar() {
        return new Cadilac();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }

}
