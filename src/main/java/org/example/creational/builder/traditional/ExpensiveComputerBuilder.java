package org.example.creational.builder.traditional;

public class ExpensiveComputerBuilder extends ComputerBuilder{
    @Override
    public void buildSysteBlock() {
        computer.setSystemBlock("Evo Plus");
    }

    @Override
    public void buildDisplay() {
        computer.setDisplay("Samsung");
    }

    @Override
    public void buildManipulators() {
        computer.setManipulators("keyboard(mechanical)+mouse+second_monitor");
    }
}
