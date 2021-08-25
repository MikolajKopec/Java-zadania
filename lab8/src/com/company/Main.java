package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    File file = new File("C:\\Users\\admin\\Desktop\\poj\\OneDrive_2_13.05.2021\\basedir\\basedir");
	    int num = 0;
	    int fold = 0;
	    int iterator = file.list().length;
	    for(int i=0;i<iterator;i++){
	        String string = String.format("C:\\Users\\admin\\Desktop\\poj\\OneDrive_2_13.05.2021\\basedir\\basedir\\dir%s",i);
            File file2 = new File(string);
            int iterator2 = file2.list().length;
            if(num<iterator2){
                num+=iterator2;
                fold=i;
            }
	    }
	    String result = String.format("Najwięcej plików ma katalog %s: ",fold);
	    System.out.println(result + num);
    }
}
