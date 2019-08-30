package com.builder;

/**
 * @author yuan
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new DellComputerBuilder());
        director.makeComputer();
        Computer computer = director.getComputer();
        System.out.println(computer);
    }
}