package org.example.creational.builder.traditional;

public class CheapComputerBuilder extends ComputerBuilder{
    @Override
    public void buildSysteBlock() {
        computer.setSystemBlock("Evo");
    }

    @Override
    public void buildDisplay() {
        computer.setDisplay("LG");
    }

    @Override
    public void buildManipulators() {
        computer.setManipulators("mouse+keyboard");
    }
}
