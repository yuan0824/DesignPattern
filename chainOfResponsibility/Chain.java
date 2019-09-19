package com.demo.chainOfResponsibility;

/**
 * @author yuan
 */
interface Chain {
    void setNext(Chain nextInChain);
    void process(int request);
}
