package org.example.creational.builder.traditional;

public class ComputerDirector {
    private ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder){
        this.computerBuilder = computerBuilder;
    }

    public Computer getComputer(){
        return computerBuilder.getComputer();
    }

    public void buildComputer(){
        computerBuilder.createNewComputer();
        computerBuilder.buildManipulators();
        computerBuilder.buildDisplay();
        computerBuilder.buildSysteBlock();
    }

    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }
}
