package com.ComputerBuild;

/**
 * @author yuan
 */
public class Builder {
    public static void main(String[] args) {
        ComputerBuilder dellComputerBuilder = new DellComputerBuilder();
        Director director = new Director(dellComputerBuilder);
        director.makeComputer();
        Computer computer = director.getComputer();
        System.out.println(computer);
    }
}
