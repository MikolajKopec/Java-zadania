package com.company;

public class Gracz {
    final String bow = "Bow";
    final String sword = "Sword";
    final String daggers = "Daggers";
    int hp;
    int min_damage;
    int max_damage;
    int str;
    int vit;
    int dex;
    int crit_chance;
    String weapon;
    int exp = 0;
    public Gracz(){
        hp = 100;
        min_damage = 1;
        max_damage = 3;
        str = 1;
        vit = 1;
        dex = 0;
        crit_chance = 20;
    }
    public Gracz(int hp, int min_damage, int max_damage, int str, int vit, int dex,String weapon,int crit_chance){
        this.hp = hp;
        this.min_damage = min_damage;
        this.max_damage = max_damage;
        this.str = str;
        this.vit = vit;
        this.dex = dex;
        this.weapon = weapon;
        this.crit_chance = crit_chance;
    }
    public void Stats(){
        System.out.println("====YOUR STATS====");
        System.out.println("HP: "+this.hp);
        System.out.println("Vitality: "+this.vit);
        System.out.println("Strenght: "+this.str);
        System.out.println("Dexterity: "+this.dex);
        System.out.println("Your weapon: "+this.weapon);
        System.out.println("Min-max damage: "+this.min_damage + " - "+this.max_damage);
    }
}
