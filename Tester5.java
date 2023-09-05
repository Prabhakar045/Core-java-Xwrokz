package com.xworkz.ExceptionHandling;

import java.io.File;
import java.io.IOException;

public class Tester5 {

    // File handling
    // compile time exception (IOException)

    public static void main(String[] args) {

       try {
           File file = new File("C:\\Users\\prabh\\Desktop\\pbk.txt");
          if(file.createNewFile()){
               System.out.println("file created " +file.getName());
          }else {
              System.out.println("file already exist");
          }

       }catch (IOException io){
           io.printStackTrace();
       }
    }
}
