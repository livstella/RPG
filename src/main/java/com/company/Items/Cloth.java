package com.company.Items;

public class Cloth extends Armor{

    //For armor, it is required to choose which slot to equip in with the chooseSlot parameter
    public Cloth(Enum chooseSlot){
        super(2,chooseSlot, ArmorTypes.Cloth,"Mage" );

    }

}
