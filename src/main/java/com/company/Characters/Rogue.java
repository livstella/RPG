package com.company.Characters;

public class Rogue extends Character{


    public Rogue(String name){
        super(2,6,1,"Rouge");
        this.name=name;


    }

    public void levelUp() {
        super.levelUp(1, 4, 1);
    }

    public void dealDamage() {
        System.out.println("DAMAGE");
    }
}
