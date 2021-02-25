package com.vsvdev.creational.abstractfactory.otherexample;

public class OSXGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new OSXButton();
    }
}