package com.Xworkz.Collefction1;

import java.util.ArrayList;
import java.util.Collection;

public class Tester1_ArrayList {
    public static void main(String[] args) {


        String moviesNames[] = new String[6];
        moviesNames[0]="";
        moviesNames[1]="";
        moviesNames[2]="";
        moviesNames[3]="";
        moviesNames[4]="";
        moviesNames[5]="";

        System.out.println(moviesNames);



        //Abstraction
        // <> Generics helps to add similar type of data
        // Here ArrayList() is giving implementation
        Collection moviesName = new ArrayList();
        //  Collection moviesName = new TreeSet();
        moviesName.add("KGF");
        moviesName.add(1);
        moviesName.add("pk");
        moviesName.add("Uppi");
        moviesName.add("jogi");
        moviesName.add("om");


        for(Object movies : moviesName){
            System.out.println(movies);
        }

        System.out.println(moviesName.size());
        System.out.println(moviesName.remove("jogi"));
        System.out.println(moviesName.size());



    }
}
