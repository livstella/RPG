package com.company.Items;

public abstract class Armor extends Item {
    Armor(Integer equipLevel,Enum equipSlot,Enum type,String allowedCharacter){
        this.equipLevel=equipLevel;
        this.equipSlot=equipSlot;
        this.type=type;
        this.allowedCharacter=allowedCharacter;

    }

}
