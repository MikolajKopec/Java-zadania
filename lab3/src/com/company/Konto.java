package com.company;

public class Konto {
    int id;
    double balance;
    public Konto(){

    }
    public Konto(int id, double blanace){
        this.id=id;
        this.balance=blanace;
    }
    public String check(){
        return "ID: "+id+" Balans konta: "+balance;
    }
    public void withdraw(int cash){
        if(this.balance-cash>0){
            this.balance-=cash;
        }
        else {
            System.out.println("Za mało pieniędzy na koncie!");
        }
    }
    public void deposit(int cash){
        this.balance+=cash;
    }
}
