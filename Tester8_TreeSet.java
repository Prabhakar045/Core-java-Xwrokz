package com.Xworkz.Collefction1;

import java.util.TreeSet;

public class Tester8_TreeSet {

    public static void main(String[] args) {

        TreeSet<String> namesSet = new TreeSet<>();


        namesSet.add("Prabhakar");
        namesSet.add("pbk");
        namesSet.add("shivya");
        namesSet.add("rk");
        namesSet.add("rohit");

        namesSet.add("pbk");

        System.out.println("Sorted Names:");
        for (String name : namesSet) {
            System.out.println(name);
        }


        String removeName = "pbk";
        namesSet.remove(removeName);
        System.out.println(removeName + " has been removed.");


        System.out.println("Updated  Names:");
        for (String name : namesSet) {
            System.out.println(name);
        }
    }
}
