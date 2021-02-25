package com.vsvdev.structural.decoratorwrapper.otherexamp;

public class UpperCasePrinter extends PrinterDecorator {
    public UpperCasePrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String str) {
        super.print(str.toUpperCase());
    }
}