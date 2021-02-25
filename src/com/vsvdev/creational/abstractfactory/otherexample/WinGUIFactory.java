package com.vsvdev.creational.abstractfactory.otherexample;

public class WinGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }
}