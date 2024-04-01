package org.example.structural.decorator;

public class LuxuryCar extends CarDecorator{

    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println(" And drives soft as luxury car");
    }
}
