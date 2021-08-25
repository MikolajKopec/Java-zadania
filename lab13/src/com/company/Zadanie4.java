package com.company;
import java.sql.SQLOutput;
import java.util.stream.Stream;

public class Zadanie4 {
    private static final String[] IMIONA = {"Anna", "Bogdan", "Karol", "Daniel", "Tomasz", "Beata", "Daniela", "Tomasz", "Jan", "Helena", "Tymoteusz", "Karol", "Roman"};

    public static void main(String[] args) {
        //A
        System.out.println("Tylko imiona damskie");
        Stream.of(IMIONA)
                .filter(imie -> imie.endsWith("a"))
                .forEach(System.out::println);
        //B
        System.out.println("Imiona męskie bez powtórzeń");
        Stream.of(IMIONA)
                .distinct()
                .filter(imie -> !imie.endsWith("a"))
                .forEach(System.out::println);
        //C
        System.out.println("Ilość imion krótszych niż 6 liter");
        Stream.of(IMIONA)
                .filter(imie -> imie.length()<6)
                .distinct()
                .forEach(System.out::println);
        //D
        System.out.println("Imiona męskie alfabetycznie bez powtórzeń");
        Stream.of(IMIONA)
                .filter(imie -> !imie.endsWith("a"))
                .distinct()
                .sorted()
                .forEach(System.out::println);
        //E
        System.out.println("Imiona posortowane alfabetycznie bez pierwszych 5 wyników");
        Stream.of(IMIONA)
                .distinct()
                .sorted()
                .skip(5)
                .forEach(System.out::println);
    }


}
