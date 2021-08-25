package com.company;

public class Main {
    public static String del_string(int l,String...string){
        int h = l;
        String arr = new String();
        for(int i = 0;i< string.length;i++ ){
            if (i != l-1) {
                arr=arr+string[i]+" ";
            }
            else {
                l+=h;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(del_string(2,"Ala","nie","ma","test","kota i","psa","papugę"));
}
}
