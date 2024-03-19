package org.example.creational.abstractfactory;


public class MSWindow implements Window {
    public void repaint() {
        // MS Windows specific behaviour
    }

    @Override
    public void setTitle(final String text) {
    }
}
