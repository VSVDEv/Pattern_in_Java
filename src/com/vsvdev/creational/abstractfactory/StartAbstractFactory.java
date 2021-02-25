package com.vsvdev.creational.abstractfactory;

public class StartAbstractFactory {



        private static TransportFactory factory;

        public static void main(String[] args) {

            if (true){
                factory = new UkrainianFactory();
            }else{
                factory = new USAFactory();
            }


            factory.createAircraft();
            factory.createCar();


        }

    }
