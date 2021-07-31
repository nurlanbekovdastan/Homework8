package com.company.characters;

public class Hero extends Game_Entity implements UseAbility{

    private Abilitys abilitys ;

    public Abilitys getAbilitys() {
        return abilitys;
    }

    public void setAbilitys(Abilitys abilitys) {
        this.abilitys = abilitys;
    }

    public Hero(int health, int damage, Abilitys abilitys) {
        super(health, damage);
        this.abilitys = abilitys;
    }

    @Override
    public void superAbility(Boss boss, Hero[] heroes) {

    }
}
