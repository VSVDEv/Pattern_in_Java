package com.vsvdev.structural.decoratorwrapper;

public class Window implements Component{

    @Override
    public void draw() {
        System.out.println("draw window");
    }

}