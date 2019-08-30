package com.builder;

/**
 * 具体建造者
 * @author yuan
 */
public class DellComputerBuilder implements ComputerBuilder {
    private Computer computer;
    public DellComputerBuilder(){
        this.computer = new Computer();
    }
    @Override
    public void buildCPU() {
        computer.setCPU("i7-8750");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("8");
    }

    @Override
    public void buildSize() {
        computer.setSize((float) 15.6);
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}
