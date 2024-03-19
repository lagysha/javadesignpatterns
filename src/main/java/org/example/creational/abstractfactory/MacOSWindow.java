package org.example.creational.abstractfactory;



public class MacOSWindow implements Window {

    @Override
    public void repaint() {
        // Mac OSX specific behaviour
    }

    @Override
    public void setTitle(final String text) {
    }
}
