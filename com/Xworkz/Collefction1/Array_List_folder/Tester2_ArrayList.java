package com.Xworkz.Collefction1.Array_List_folder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tester2_ArrayList {

    public static void main(String[] args) {

        List<String> moviesName = new ArrayList<>(4);  // does give INdixOutOfBoundException bcz it dynamic nature

        moviesName.add("KGF");
        moviesName.add("KGF 2");
        moviesName.add("Pk");
        moviesName.add("Uppi");
        moviesName.add("Jogi");

        //Collections is Class    & Set internally call sort method no need to write expecitely.
        Collections.sort(moviesName);


        for(Object movies : moviesName){
            System.out.println(movies);
        }



    }
}
