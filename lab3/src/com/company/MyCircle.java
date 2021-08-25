package com.company;


public class MyCircle {
    int radius;
    public MyCircle(int radius){
        this.radius = radius;
    }
    public double circum(){
        return radius*Math.PI*2;
    }
    public double area(){
        return  Math.pow(radius,2)*Math.PI;
    }
    public int diameter(){
        return radius*2;
    }
}
