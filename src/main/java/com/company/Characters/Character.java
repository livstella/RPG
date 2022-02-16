package com.company.Characters;

import com.company.Items.Item;

import java.util.HashMap;

public abstract class Character extends PrimaryAttribute {

    public String name;
    public Integer level = 1;
    public String characterType;
    public HashMap equippedItems = new HashMap<String,Enum>();

    Character(Integer strength, Integer dexterity, Integer intelligence, String characterType){
        this.characterType = characterType;
        this.baseStrength=strength;
        this.baseDexterity=dexterity;
        this.baseIntelligence=intelligence;

        this.totalStrength=baseStrength;
        this.totalDexterity=baseDexterity;
        this.totalIntelligence=baseIntelligence;
        this.characterType=characterType;


    }

    public abstract void dealDamage(/*Must be updated with actual damage*/);


    //Method for levelling up the character
    public void levelUp(Integer strengthGain, Integer dexterityGain, Integer intelligenceGain)
    {
       level ++;
        totalStrength+=strengthGain;
       totalDexterity+=dexterityGain;
       totalIntelligence+=intelligenceGain;
       System.out.println("Current level is:" + level);
    }


    //Method for equipping items
    public void equip(Item item){
        if (item.equipLevel<=level && item.allowedCharacter.equals(this.characterType)  ){
           //Puts the equipped item in the equipped items Hashmaps. Uses the string value of the Enum equipslot as a key.
            equippedItems.put(String.valueOf(item.equipSlot),item.type);
            System.out.println(item.type + " has been equipped in the slot " + String.valueOf(item.equipSlot) );

        }else {
            System.out.println("you cannot equip this item");

        }

    }

}
