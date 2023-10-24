package com.Xworkz.Collefction1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Tester2 {

    public static void main(String[] args) {

        Collection movieId = new ArrayList();
        movieId.add(1);
        movieId.add(2);
        movieId.add(3);

        for (Object movie : movieId){
            System.out.println(movie);
        }
    }
}
