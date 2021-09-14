package com.company;

public abstract class Hero extends GameEntity {
    private ability ability;
    public Hero(int health, int damage, AbilityType ability critical) {
        super(health,damage);

    }
}
