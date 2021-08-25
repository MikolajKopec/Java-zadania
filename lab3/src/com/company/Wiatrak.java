package com.company;

public class Wiatrak {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    int speed;
    boolean on;
    int radius;
    String color;
    public Wiatrak(){
        this.radius=5;
        this.color="White";
    }
    public Wiatrak(int speed,int radius,String color){
        switch (speed){
            case 0:
                this.on=false;
                this.speed=0;
                break;
            case 1:
                this.on=true;
                this.speed=SLOW;
            case 2:
                this.on=true;
                this.speed=MEDIUM;
            case 3:
                this.on=true;
                this.speed=FAST;
        }
        this.radius = radius;
        this.color = color;
    }
    public String informacje(){
        return "Włączony: " + on + " Prędkość: " + speed + " Promień: " + radius + " Kolor: " + color;
    }
}
