package com.Xworkz.Collefction1.Array_List_folder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Tester3_LinkedList {
    public static void main(String[] args) {

        //abstration
        LinkedList<String> moviesName = new LinkedList<>();  // does give IndexOutOfBoundException bcz it dynamic nature

        moviesName.addLast("KGF");
        moviesName.add("KGF 2");
        moviesName.add("pk");
        moviesName.add("Uppi");
        moviesName.add("jogi");
        moviesName.addFirst("Charlie 777");


        for(Object movies : moviesName){
            System.out.println(movies);
        }
    }
}
