package com.builder;

/**
 * 具体建造者
 * @author yuan
 */
public class HPComputerBuilder implements ComputerBuilder {
    private Computer computer;
    public HPComputerBuilder(){
        this.computer = new Computer();
    }
    @Override
    public void buildCPU() {
        computer.setCPU("i9-9900");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("16");
    }

    @Override
    public void buildSize() {
        computer.setSize((float) 14);
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}
