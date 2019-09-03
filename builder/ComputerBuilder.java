package com.demo.builder;

/**
 * 抽象建造者
 * @author yuan
 */
public interface ComputerBuilder {
    void buildCPU();
    void buildMemory();
    void buildSize();
    Computer getComputer();
}
