package com.xworkz;

import com.xworkz.dto.*;

public class AllDTOTester {

    public static void main(String[] args) {
        BoardDTO dto = new BoardDTO();
        dto.setId(1);
        dto.setBoardName("jk board");
        dto.setSize("123*45");
        System.out.println(dto);   // implicit or Indirectly calling of toString()

        //System.out.println(dto.toString());  // Explicitly
        //BoardDTO dto1 = dto;



        BoardDTO dto1 =  new BoardDTO();
        dto1.setId(1);
        dto1.setBoardName("jk board");
        dto1.setSize("123*45");

        boolean comapre = dto.equals(dto1);
        System.out.println(comapre);
        System.out.println(dto1.equals(dto));   //Always false , bcz different memory location will compare when we se equals
        System.out.println(dto1.equals(dto));

    }
}
