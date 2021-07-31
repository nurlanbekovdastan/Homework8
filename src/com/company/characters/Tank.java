package com.company.characters;

import java.util.Random;

public class Tank extends Hero{

    private int super_damage;

    public Tank(int health, int damage, int super_damage) {
        super(health, damage, Abilitys.REVERSE_DAMAGE);
        this.super_damage = super_damage;
    }



    public int getSuper_damage() {
        return super_damage;
    }

    public void setSuper_damage(int super_damage) {
        this.super_damage = super_damage;
    }

    @Override
    public void superAbility(Boss boss, Hero[] heroes) {

        Random r2 = new Random();
        int cf = r2.nextInt(4) * 2;
        boss.setHealth(boss.getHealth() - boss.getDamage() + super_damage * cf );
        System.out.println("Танк нанес супер удар " + boss.getDamage() + super_damage * cf);
    }

}
