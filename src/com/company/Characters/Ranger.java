package com.company.Characters;

public class Ranger extends Character {

    public Ranger(String name){
        super(1,7,1);
        this.name=name;

    }

    public void levelUp() {
        super.levelUp(1, 5, 1);
    }

    public void dealDamage() {
        System.out.println("DAMAGE");
    }
}
