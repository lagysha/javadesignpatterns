package org.example.structural.decorator;

public class BasicCar implements Car{
    @Override
    public void drive() {
        System.out.println("Basic Car Drives");
    }
}
