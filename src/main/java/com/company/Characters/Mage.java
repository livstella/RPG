package com.company.Characters;

public class Mage extends Character  {

   public Mage(String name){
        super(1,1,8, "Mage");
        this.name=name;

    }

    public void levelUp() {
        super.levelUp(1, 1, 5);
    }
    public void dealDamage() {
        System.out.println("DAMAGE");
    }
}
