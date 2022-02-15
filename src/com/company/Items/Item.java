package com.company.Items;

public abstract class Item {

    //Basic properties all items will have
    public String name;
    public Integer equipLevel;
    public Enum equipSlot;
    public Enum type;
    public String allowedCharacter;

    //Methods that checks if the characters is of the type of character than can equip the item an the level is high enough
    public void equip(String equippingCharacter, Integer level) {
        if (allowedCharacter.equals(equippingCharacter)&& level>= equipLevel) {
            System.out.println(type + " has been equipped");
        } else {
            System.out.println("you cannot equip");

        }
    }
}
