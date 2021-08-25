package com.company;
public class Account {
    private String accountName;
    private double balance;

    public Account(String accountName, double initialBalance) {
        this.accountName = accountName;
        this.balance = initialBalance;
    }

    public int withdraw(int amount) {
        balance-=amount;
        if (balance<0){
            throw new RuntimeException("You don't have that much money!");
        }
        return amount;
    }

    public double getBalance() {
        return balance;
    }
}
