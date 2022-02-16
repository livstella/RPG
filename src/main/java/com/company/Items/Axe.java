package com.company.Items;

public class Axe extends Weapon {
    //Creates the axe, requires the name given to the axe, and the type & level of character trying to equip.

            //****parameters should be moved to super class*******//
    public Axe(String name){
        //Giving values to properties from abstract class Item
        this.name=name;
        this.equipLevel=2;
        this.equipSlot=slotTypes.Weapon;
        this.type=WeaponTypes.Axe;
        this.allowedCharacter="Warrior";



        //Giving values to properties from abstract class Weapon
        this.damage=10;
        this.attackSpeed=10;
    }




}
