package com.company;

public class zad6 {
    public static void main(String[] args) {
        Wiatrak wiatrak1 = new Wiatrak();
        System.out.println(wiatrak1.informacje());
        Wiatrak wiatrak2 = new Wiatrak(3,10,"czerwony");
        System.out.println(wiatrak2.informacje());
    }
}
