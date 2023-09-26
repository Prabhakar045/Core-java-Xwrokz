package com.Xworkz.Collefction1;

import java.util.ArrayList;
import java.util.List;

public class Tester3_List {

    public static void main(String[] args) {

        //Abstraction
        // <> Generics helps to add similar type of data
        // Here ArrayList() is giving implementation
        List<String> moviesName = new ArrayList<>();
        //  Collection moviesName = new TreeSet();
        moviesName.add("KGF");
        moviesName.add("KGF 2");
        moviesName.add("pk");
        moviesName.add("Uppi");
        moviesName.add("jogi");
        moviesName.add("om");
        moviesName.add("Gadar");
        moviesName.add("Pathan");
        moviesName.add(3, "pbk");
        moviesName.add(null);
        moviesName.add(null);
        moviesName.add("KGF");



        for(Object movies : moviesName){
            System.out.println(movies);
        }

        System.out.println(moviesName.size());
        System.out.println(moviesName.remove("jogi"));
        System.out.println(moviesName.size());

    }

}
