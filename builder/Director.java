package com.builder;

/**
 * 指挥者
 * @author yuan
 */
public class Director {
    private ComputerBuilder computerBuilder;
    public Director(ComputerBuilder computerBuilder){
        this.computerBuilder = computerBuilder;
    }
    public void makeComputer(){
        this.computerBuilder.buildCPU();
        this.computerBuilder.buildMemory();
        this.computerBuilder.buildSize();
    }
    public Computer getComputer(){
        return this.computerBuilder.getComputer();
    }
}
