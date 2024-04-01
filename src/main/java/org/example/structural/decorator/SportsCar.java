package org.example.structural.decorator;

public class SportsCar extends CarDecorator {

    private String transmissionMode;

    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println(" And drives fast like a Sports Car");
    }

    public void setTransmissionMode(String transmissionMode){
        this.transmissionMode = transmissionMode;
    }
}
