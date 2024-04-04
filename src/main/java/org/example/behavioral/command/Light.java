package org.example.behavioral.command;

public class Light {
    private boolean isOn;

    public void switchOn(){
        isOn = true;
    }

    public void switchOff(){
        isOn = false;
    }
}
