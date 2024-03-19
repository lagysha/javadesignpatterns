package org.example.creational.builder.traditional;

public class DemoApp {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector(new CheapComputerBuilder());

        director.buildComputer();
        Computer computer1 = director.getComputer();
        System.out.println(computer1);

        director.setComputerBuilder(new ExpensiveComputerBuilder());
        director.buildComputer();
        Computer computer2 = director.getComputer();
        System.out.println(computer2);
    }
}
