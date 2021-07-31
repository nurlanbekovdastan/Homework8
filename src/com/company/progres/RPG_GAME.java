package com.company.progres;

import com.company.characters.*;

public class RPG_GAME {

    public static void start() {

        Boss boss = new Boss(1000, 100);
        Magic magic = new Magic(300, 20, 10);
        Tank tank = new Tank(800, 1, 10);
        Warrior warrior = new Warrior(300, 20, 10);


        Hero[] heroes = {magic, tank, warrior};

        while (!isFinished(boss,heroes)){
        round(boss,heroes);
    }

}


    private static void fightInfo(Boss boss, Hero[] heroes){
        System.out.println("_____________");
        System.out.println("Здоровья Босса:" + boss.getHealth());
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].getClass().getSimpleName() + " здоровья:" + heroes[i].getHealth());
        }

        System.out.println("_____________");


    }

    private static void round(Boss boss, Hero[] heroes) {
        bossHit(boss, heroes);
        heroesHit(boss, heroes);
        standAbility(boss, heroes);
        fightInfo(boss, heroes);




    }

    private static boolean isFinished(Boss boss, Hero[] heroes){

        if (boss.getHealth() <= 0) {
            if (boss.getHealth() <= 0) {
                boss.setHealth(0);
                System.out.println("Команда героев победила!!");
                return true;
            }
        }


        boolean allStandUsersDied = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 ){
                if (heroes[i].getHealth() <= 0)
                    return false;
                allStandUsersDied = false;
                break;
            }


        }

        if (allStandUsersDied){
            System.out.println("Босс выиграл!");
        }
        return allStandUsersDied;
    }


    private static void bossHit(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && boss.getHealth() > 0){
                heroes[i].setHealth(heroes[i].getHealth());
            }
            if (heroes[i].getHealth() > 0) {
                heroes[i].setHealth(heroes[i].getHealth() - boss.getDamage());
            }
        }
    }

    private static void heroesHit(Boss boss, Hero[] heroes){

        for (int i = 0; i < heroes.length; i++) {
            if (boss.getHealth() > 0 && heroes[i].getHealth() > 0){
                boss.setHealth(boss.getHealth());
            }
            if (boss.getHealth() > 0){
                boss.setHealth(boss.getHealth() - heroes[i].getDamage());

            }else {
                if (boss.getHealth() - heroes[i].getDamage() <= 0){
                }
            }

        }


    }

    private static void standAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].superAbility(boss, heroes);
        }

        if (boss.getHealth() < 0) {
            boss.setHealth(0);
        }
        for (int i = 0; i < heroes.length; i++) {


            if (heroes[i].getHealth() > 0 && heroes[i].getDamage() < 0) {
                heroes[i].setHealth(0);
            }
        }

    }

}
