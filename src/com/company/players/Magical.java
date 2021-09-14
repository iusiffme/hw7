package com.company.players;

import com.company.AbilityType;

public class Magical extends Hero{

    public Warrior(int health, int damage) {
        super(health, damage, AbilityType.SAVE_DAMAGE_AND_REVERT);
    }

}
