package com.xworkz.CodingQuestions;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        int a[] = {78, 12, 55, 1}; // Array of integers
//        int a[] = {78, 12, 55, 1,22.00,pbk};  sort method not able to sort different kind of data
        Arrays.sort(a); // Sort the array

        System.out.println(Arrays.toString(a)); // Print the sorted array
    }
}
