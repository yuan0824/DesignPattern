package com.builder;

/**
 * 产品
 * @author yuan
 */
public class Computer {
    private String CPU;
    private String memory;
    private float size;

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setSize(float size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Computer{" + "CPU='" + CPU + '\'' + ", memory='" + memory + '\'' + ", size=" + size + '}';
    }
}
