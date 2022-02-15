package com.company.Characters;

public class Warrior extends Character{

    public Warrior(String name){
        super(5,2,1);
        this.name=name;


    }

    public void levelUp() {
        super.levelUp(3, 2, 1);
    }

    public void dealDamage() {
        System.out.println("DAMAGE");
    }
}
