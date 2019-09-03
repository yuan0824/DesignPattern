package com.demo.builder;

/**
 * 指挥者
 * @author yuan
 */
public class Director {
    private ComputerBuilder computerBuilder;
    Director(ComputerBuilder computerBuilder){
        this.computerBuilder = computerBuilder;
    }
    void makeComputer(){
        this.computerBuilder.buildCPU();
        this.computerBuilder.buildMemory();
        this.computerBuilder.buildSize();
    }
    Computer getComputer(){
        return this.computerBuilder.getComputer();
    }
}
