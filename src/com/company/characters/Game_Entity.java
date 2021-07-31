package com.company.characters;

public abstract class Game_Entity {

    private int health;
    private int damage;

    public Game_Entity() {

    }

    public int getHealth() {return health; }

    public void setHealth(int health)  {this.health = health;}

    public int getDamage()  {return damage; }

    public Game_Entity(int health, int damage){
        this.health = health;
        this.damage = damage;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }


}
