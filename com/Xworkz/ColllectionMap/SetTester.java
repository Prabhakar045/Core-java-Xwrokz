package com.Xworkz.ColllectionMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetTester {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        System.out.println("put");
        System.out.println(map.put(1, "bpk"));
        System.out.println(map.put(1, "String"));

        System.out.println("Map");;
        System.out.println(map.get(1));

        Set<String> set = new HashSet<>();
        set.add("Huli");
        set.add("benki");

        for (String str : set){
            System.out.println(str);
        }
    }
}
