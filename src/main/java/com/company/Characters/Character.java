package com.company.Characters;

import com.company.Items.Item;
import com.company.Items.Weapon;

import java.util.HashMap;

public abstract class Character extends PrimaryAttribute {

    public String name;
    public Integer level = 1;
    public String characterType;
    public HashMap equippedItems = new HashMap<String,Enum>();
    public double mainPrimaryAttribute;
    public double weaponDPS=1;


    Character(Integer strength, Integer dexterity, Integer intelligence, String characterType, Integer mainPrimaryAttribute){
        this.characterType = characterType;
        this.baseStrength=strength;
        this.baseDexterity=dexterity;
        this.baseIntelligence=intelligence;

        this.totalStrength=baseStrength;
        this.totalDexterity=baseDexterity;
        this.totalIntelligence=baseIntelligence;
        this.characterType=characterType;
        this.mainPrimaryAttribute=mainPrimaryAttribute;



    }

    public abstract void dealDamage(/*Must be updated with actual damage*/);


    //Method for levelling up the character
    public void levelUp(Integer strengthGain, Integer dexterityGain, Integer intelligenceGain, Integer mainPrimaryAttributeGain)
    {
       level ++;
        totalStrength+=strengthGain;
       totalDexterity+=dexterityGain;
       totalIntelligence+=intelligenceGain;
       mainPrimaryAttribute+=mainPrimaryAttributeGain;
       System.out.println("Current level is:" + level);
    }


    //Method for equipping items
    public void equip(Weapon item) {
        System.out.println("test");
        if (item.equipLevel <= level && item.allowedCharacter.equals(this.characterType)) {
            //Puts the equipped item in the equipped items Hashmaps. Uses the string value of the Enum equipSlot as a key.
            equippedItems.put(String.valueOf(item.equipSlot), item.type);
            System.out.println(item.type + " has been equipped in the slot " + String.valueOf(item.equipSlot));

            //If the equipped item is a weapon, weaponDPS is updated
            if (String.valueOf(item.equipSlot).equals("Weapon")) {
                weaponDPS = item.damage * item.attackSpeed;
                System.out.println(weaponDPS);
            } }else {
                System.out.println("you cannot equip this item");

            }


    }
    public void displayStats(){
        double characterDPS=weaponDPS*(1+mainPrimaryAttribute/100);
        String characterStats =
                "Name: " + name +
                ". Level: " + level +
                ". Strength: " + totalStrength +
                ". Dexterity: " + totalDexterity +
                ". Intelligence: " + totalIntelligence +
                ". DPS: " + characterDPS;

        System.out.println(characterStats);
    }

}
