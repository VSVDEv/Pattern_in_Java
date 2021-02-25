package com.vsvdev.creational.abstractfactory;


import com.vsvdev.creational.abstractfactory.Aircraft;
import com.vsvdev.creational.abstractfactory.Car;

// фабрика по созданию транспортных средств
public interface TransportFactory {

    // что фабрика будет производить

    Car createCar();// автомобили

    Aircraft createAircraft(); // самолеты

}
