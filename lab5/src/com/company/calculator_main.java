package com.company;

public class calculator_main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(2));
        System.out.println(calculator.calculate(2,5));
        System.out.println(calculator.calculate(2,5,10));
    }
}
