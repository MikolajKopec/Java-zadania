package com.company;

public class Calculator {
    protected Calculator(){
    }
    protected int calculate(int x){
        return x*x;
    }
    protected  int calculate(int x,int z){
        return x*z;
    }
    protected  int calculate(int x, int z, int y){
        return x+z+y;
    }
}
