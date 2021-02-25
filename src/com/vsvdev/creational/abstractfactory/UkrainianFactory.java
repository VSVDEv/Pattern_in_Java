package com.vsvdev.creational.abstractfactory;


//  транспортные средства
public class UkrainianFactory implements TransportFactory{

    @Override
    public Car createCar() {
        return new Daewoo();
    }


    @Override
    public Aircraft createAircraft() {
        return new Anton();
    }

}