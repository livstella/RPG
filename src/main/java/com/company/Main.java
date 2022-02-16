package com.company;

import com.company.Characters.Mage;
import com.company.Characters.Ranger;
import com.company.Characters.Warrior;
import com.company.Items.Axe;
import com.company.Items.WeaponTypes;

public class Main {
     public static void main(String[] args) {

Ranger b =new Ranger("Öncel");


Warrior Trunte=new Warrior("Trunte");


 Axe c = new Axe();
         System.out.println(c.DPS);

         b.equip(c);
         Trunte.equip(c);

    }
}
