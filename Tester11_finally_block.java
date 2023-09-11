package com.xworkz.ExceptionHandling;

import java.util.Scanner;

public class Tester11_finally_block {





        public static void main(String[] args) {
            System.out.println("main started");
            Scanner sc = null;

            try {

                sc = new Scanner(System.in);
                System.out.println(" enter the data ");


                String str = sc.next();
                System.out.println(str.length());

                System.out.println(11 / 0);

            }catch (NullPointerException | ArithmeticException e){
                e.printStackTrace();
            }catch (Exception w){

            }finally {                             // finally block used to close all resources
                System.out.println("Inside finally block , closing sc");

                if(sc != null){
                    sc.close();
                }
            }

            System.out.println("main ended");
        }


}
