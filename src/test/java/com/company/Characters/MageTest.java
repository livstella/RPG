package com.company.Characters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Arrange
//Act
//Assert

class MageTest {

    @Test
    public void MageConstructor_valid_level1(){
        //Arrange
        Mage mage=new Mage("mage");

        Integer expectedLevel=1;
        Integer expectedStrength=1;


        //Act
        Integer actualLevel= mage.level;


        //Assert
        assertEquals(expectedLevel,actualLevel);




    }

    @Test
    public void MageConstructor_valid_CorrectAttributes(){

        //Arrange
        Mage mage=new Mage("mage");

        Integer expectedStrength=1;
        Integer expectedDexterity=1;
        Integer expectedIntelligence=8;

        //Act
        Integer actualStrength=mage.totalStrength;
        Integer actualDexterity=mage.totalDexterity;
        Integer actualIntelligence=mage.totalIntelligence;

        //Assert
        assertEquals(expectedStrength,actualStrength);
        assertEquals(expectedDexterity,actualDexterity);
        assertEquals(expectedIntelligence,actualIntelligence);


    }





    @Test
    public void levelUp_valid(){

        //Arrange
        Mage mage=new Mage("mage");

        Integer expectedLevel= 2;
        Integer expectedStrength=2;
        Integer expectedDexterity=2;
        Integer expectedIntelligence=13;

        //act
        mage.levelUp();

        Integer actualLevel=mage.level;
        Integer actualStrength=mage.totalStrength;
        Integer actualDexterity=mage.totalDexterity;
        Integer actualIntelligence=mage.totalIntelligence;

        //Assert
        assertEquals(expectedLevel,actualLevel);
        assertEquals(expectedStrength,actualStrength);
        assertEquals(expectedDexterity,actualDexterity);
        assertEquals(expectedIntelligence,actualIntelligence);
    }

}