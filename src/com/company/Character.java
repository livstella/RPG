package com.company;

public abstract class Character extends PrimaryAttribute {

    String name;
    Integer level = 1;

    Character(Integer strength, Integer dexterity, Integer intelligence){
        this.baseStrength=strength;
        this.baseDexterity=dexterity;
        this.baseIntelligence=intelligence;

        this.totalStrength=baseStrength;
        this.totalDexterity=baseDexterity;
        this.totalIntelligence=baseIntelligence;


    }

    public abstract void dealDamage();

    public void levelUp(Integer strengthGain, Integer dexterityGain, Integer intelligenceGain)
    {
       level ++;
        totalStrength+=strengthGain;
       totalDexterity+=dexterityGain;
       totalIntelligence+=intelligenceGain;
       System.out.println("Current level is:" + level);
    }


    public void testing(){
        System.out.println("test");
    }
}
