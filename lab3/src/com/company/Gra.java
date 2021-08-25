package com.company;
import java.util.Scanner;

public class Gra {
    public static int min_dmg,max_dmg,hp,str,vit,dex,crit_chance;
    public static String weapon;
    public static int roll(){
        double roll_d;
        roll_d = (Math.random()*6)+1;
        return (int)roll_d;
    }
    public static boolean check_dex(int player, int mob){
        if(player>mob){
            return true;
        }
        else return false;
    }
    public static int check_dmg(int min,int max,int dex){
        double dmg = Math.random()*(max-min)+min;
        int crit_chance = dex*5;
        if(Math.random()*100<=crit_chance){
            dmg=dmg*2.5;
        }
        return (int)dmg;
    }
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wybierz klasę postaci: (1-Wojownik/2-Łucznik/3-Złodziej)");
        int player_class = scan.nextInt();
        System.out.println("Wybierz broń: (1-Miecz/2-Łuk/3-Sztylety)");
        int player_weapon=scan.nextInt();
        switch (player_class){
            case 1:
                hp = 120;
                str = 10;
                vit = 5;
                dex = 0;
                break;
            case 2:
                hp = 150;
                str = 5;
                vit = 4;
                dex = 5;
                break;
            case 3:
                hp = 100;
                str = 0;
                vit = 7;
                dex = 10;
                break;
        }

        switch (player_weapon){
            case 1:
                weapon = "Miecz";
                min_dmg = 5;
                max_dmg = 10;
                break;
            case 2:
                weapon = "Łuk";
                min_dmg = 9;
                max_dmg = 9;
                break;
            case 3:
                weapon = "Sztylety";
                min_dmg = 3;
                max_dmg = 16;
                break;
        }
        min_dmg+=str;
        max_dmg+=str;
        hp+=vit*2;
        crit_chance = dex*3;
        Gracz player = new Gracz(hp,min_dmg,max_dmg,str,vit,dex,weapon,crit_chance);
        player.Stats();
        while (player.hp>0){
            System.out.println("Chcesz wejść do lochu czy wrócić do wioski? (1-wyrusz na wyprawę/ 2 - zakończ przygodę");
            int wtg = scan.nextInt();
            if (wtg==1){
                Przeciwnik mob = new Przeciwnik();
                System.out.println("Wchodzisz do lochu i  spotykasz: " + mob.name);
                System.out.println("Co robisz? 1 - Walcz/ 2- Uciekaj!");
                int dec = scan.nextInt();
                boolean escape =false;
                if (dec==2){
                    int roll = roll();
                    System.out.println(roll);
                    if (roll<5){
                        System.out.println(mob.name+" był szybszy, musisz walczyć!");
                        escape = false;
                    }
                    else{
                        System.out.println("Na szczęście udało ci się uciec!");
                        escape = true;
                    }
                }
                if (escape==false){
                    System.out.println("Walka!");
                    while(player.hp>0 && mob.hp>0) {
                        Thread.sleep(1000);
                        if (check_dex(player.dex, mob.dex)) {
                            int player_dmg = check_dmg(player.min_damage,player.max_damage,player.dex);
                            mob.hp-=player_dmg;
                            System.out.println(mob.name+" otrzymał: "+ player_dmg);
                            System.out.println("Zostało: " + mob.hp);
                            int mob_dmg = check_dmg(mob.min_damage, mob.max_damage, mob.dex);
                            player.hp-=mob_dmg;
                            System.out.println(mob.name+" zadał: "+ mob_dmg);
                            System.out.println("Zostało ci: " + player.hp);
                        }
                        else {
                            int mob_dmg = check_dmg(mob.min_damage, mob.max_damage, mob.dex);
                            player.hp-=mob_dmg;
                            System.out.println(mob.name+" zadał: "+ mob_dmg);
                            System.out.println("Zostało ci: " + player.hp);
                            int player_dmg = check_dmg(player.min_damage,player.max_damage,player.dex);
                            mob.hp-=player_dmg;
                            System.out.println(mob.name+" otrzymał: "+ player_dmg);
                            System.out.println("Zostało: " + mob.hp);
                        }
                    }
                    if (mob.hp<=0){
                        player.exp+= mob.exp;
                        System.out.println("Brawo! Pokonałeś "+mob.name+"! Otrzymujesz " + mob.exp+" punktów doświadczenia.");
                        System.out.println("Masz "+player.exp+" punktów doświadczenia!" );
                    }
                    else {
                        System.out.println("Niestety "+mob.name+" okazał się silniejszy. Nie żyjesz.");
                    }
                }
            }
            else{
                player.hp=0;
            }

        }
    }
}
