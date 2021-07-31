package com.company.characters;

import java.util.Random;

public class Warrior extends Hero {

    private int  super_kick;

    public Warrior(int health, int damage, int super_kick) {
        super(health, damage, Abilitys.CRITICAL_DAMAGE);
        this.super_kick = super_kick;
    }

    public int getSuper_kick() {
        return super_kick;
    }

    public void setSuper_kick(int super_kick) {
        this.super_kick = super_kick;
    }

    @Override
    public void superAbility(Boss boss, Hero[] heroes) {

        Random random = new Random();
        int coeff = random.nextInt(10) + 1;
        boss.setHealth(boss.getHealth()-coeff);
        System.out.println("Боец нанес критический урон:" + coeff);

    }
}

