package com.company;

public class Mage extends Character  {

    Mage(String name){
        super(1,1,8);
        this.name=name;

    }

    public void levelUp() {
        super.levelUp(1, 1, 5);
    }
    public void dealDamage() {
        System.out.println("DAMAGE");
    }
}
