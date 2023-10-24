package com.xworkz;

public class Rev {

    // deve&nd$@!ra
    // ardn&ev$@!ed
    public static void main(String[] args) {
        System.out.println("main started");
        String p = "prabhakar";

        char ch[] =  p.toCharArray();
        System.out.println(ch);
         int l=ch.length;
        reverse(ch,0,l);
        System.out.println();
        System.out.println("main ended");
    }

    public static void reverse(char ch[], int index, int length)  {

        if(index < length)
        {

        char temp = ch[index];
        reverse(ch, index+1, length);
        System.out.print(temp);
    }
    }

}
