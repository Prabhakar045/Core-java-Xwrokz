package com.xworkz.ExceptionHandling;

import java.io.File;
import java.io.IOException;

public class Tester51 {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\prabh\\Desktop\\manthesh.pdf");
        try {
            if(!file.createNewFile()){
                System.out.println("create new file " +file.getName());
            }else {
                System.out.println("fle already exist");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
