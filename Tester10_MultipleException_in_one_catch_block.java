package com.xworkz.ExceptionHandling;

public class Tester10_MultipleException_in_one_catch_block {

    public static void main(String[] args) {
        System.out.println("main started");

        try {

            String str = null;
            System.out.println(str.length());

            System.out.println(11 / 0);

        }catch (NullPointerException | ArithmeticException e){
            e.printStackTrace();
        }catch (Exception w){

        }
//        catch (NullPointerException e){
//            e.printStackTrace();
//        }catch (ArrayIndexOutOfBoundsException a){
//            a.printStackTrace();
//        }catch (Exception d){                           // polymorphism
//
//        }

        System.out.println("main ended");
    }
}
