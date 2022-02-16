package com.company.Items;

public abstract class Weapon extends Item{
    public Integer damage;
    public Integer attackSpeed;
    public Integer DPS;

    Weapon(Integer equipLevel,Enum equipSlot,Enum type,String allowedCharacter, Integer damage,Integer attackSpeed){
        this.equipLevel=equipLevel;
        this.equipSlot=equipSlot;
        this.type=type;
        this.allowedCharacter=allowedCharacter;
        this.damage=damage;
        this.attackSpeed=attackSpeed;
        DPS=damage*attackSpeed;

    }





}
