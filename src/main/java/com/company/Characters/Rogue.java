package com.company.Characters;

public class Rogue extends Character{


 Rogue(String name){
        super(2,6,1,"Rouge",6 );
        this.name=name;




    }

    public void levelUp() {
        super.levelUp(1, 4, 1, 4);
    }

    public void dealDamage() {
        System.out.println("DAMAGE");
    }
}
