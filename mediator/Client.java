package com.demo.mediator;

/**
 * @author yuan
 */
public class Client {
    public static void main(String[] args) {
        Government government = new Government();

        Construction construction = new Construction(government);
        Defense defense = new Defense(government);
        Finance finance = new Finance(government);

        government.setConstruction(construction);
        government.setDefense(defense);
        government.setFinance(finance);

//        defense.fight();
//        construction.buildPalace();
//        finance.grant();

//        government.develop();
//        government.defend();
        government.dealDisaster();
    }
}
