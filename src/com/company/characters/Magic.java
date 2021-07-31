package com.company.characters;

import java.util.Random;

public class Magic extends Hero {

    private int super_magic;

    public Magic(int health, int damage, int super_magic) {
        super(health, damage, Abilitys.UP_DAMAGE);
        this.super_magic = super_magic;
    }



    public int getSuper_magic() {
        return super_magic;
    }

    public void setSuper_magic(int super_magic) {
        this.super_magic = super_magic;
    }

    @Override
    public void superAbility(Boss boss, Hero[] heroes) {

        Random r1 = new Random();
        int cof = r1.nextInt(5) * 3;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getAbilitys().equals(Abilitys.UP_DAMAGE)){
                boss.setHealth(boss.getHealth()-super_magic * cof);
            }
            System.out.println("Маг поднял урон на :"  +  cof * super_magic);
        }
    }
}
