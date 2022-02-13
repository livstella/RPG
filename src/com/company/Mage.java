package com.company;

public class Mage extends Character  {
    Mage(){
        this.baseStrength=1;
        this.baseDexterity=1;
        this.baseIntelligence=8;
    }

    public void dealDamage() {
        System.out.println("DAMAGE");
    }



}
