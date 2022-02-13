package com.company;

public abstract class Character extends PrimaryAttribute {

    String name;
    Integer level = 1;

    public Integer totalStrength=baseStrength;
    Integer totalDexterity=baseDexterity;
    Integer totalIntelligence=baseIntelligence;


    public abstract void dealDamage();
    //public void levelUp(){
    //    level ++;
    //}

}
