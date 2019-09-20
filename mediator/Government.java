package com.demo.mediator;

/**
 * @author yuan
 */
public class Government implements Mediator {
    private Construction construction;
    private Defense defense;
    private Finance finance;

    void setConstruction(Construction construction){
        this.construction = construction;
    }

    void setDefense(Defense defense){
        this.defense = defense;
    }

    void setFinance(Finance finance){
        this.finance = finance;
    }

    void dealDisaster() {
        System.out.println("处理灾害");
        finance.grant();
    }

    void defend() {
        System.out.println("处理入侵");
        defense.fight();
    }

    void develop() {
        System.out.println("发展");
        construction.buildPalace();
    }

    @Override
    public void notify(String message, Department department) {
        if(department == construction)
        {
            finance.GetMessage(message);
        }
        if(department == defense)
        {
            finance.GetMessage(message);
        }
        if(department == finance)
        {
            construction.GetMessage(message);
        }
    }
}
