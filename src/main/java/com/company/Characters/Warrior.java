package com.company.Characters;

public class Warrior extends Character{

    public Warrior(String name){
        super(5,2,1, "Warrior",5);
        this.name=name;
        this.mainPrimaryAttribute=this.totalStrength;


    }

    public void levelUp() {
        super.levelUp(3, 2, 1,3);
    }

    public void dealDamage() {
        System.out.println("DAMAGE");
    }
}
