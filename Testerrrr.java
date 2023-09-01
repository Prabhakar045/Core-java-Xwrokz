package com.xworkz.Parsing;

import org.w3c.dom.ls.LSOutput;

public class Testerrrr {


    public static void main(String[] args) {

        //parsing  --> String to integer converting
        String phnNo = "8431330277";
        Long contactNo = Long.parseLong(phnNo);
        System.out.println(contactNo);

        String age ="23";
        int age1= Integer.parseInt(age);
        System.out.println(age1);

        String id = "1";
        Byte idNo = Byte.parseByte(id);
        System.out.println(idNo);

        String roadNo = "23";
        Short newradNo = Short.parseShort(roadNo);
        System.out.println(newradNo);

        String no = "3.1444444444";
        Double no1 = Double.parseDouble(no);
        System.out.println(no1);

        String f = "3.14";
        Float f1 = Float.parseFloat(f);
        System.out.println(f1);


    }

}
