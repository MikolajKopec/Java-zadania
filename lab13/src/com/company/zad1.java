package com.company;
import java.util.function.Function;

public class zad1 {

    public static void main(String[] args) {
        System.out.println(string_lenght.apply("Ala"));
    }
    public static Function<String,Integer> string_lenght = x -> x.length();
}
