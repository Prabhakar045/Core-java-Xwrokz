package com.xworkz.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
@EqualsAndHashCode
//import lombok.ToString;

@Getter
@Setter

public class BoardDTO {
    private int id;
    private String boardName;
    private String size;

    @Override
    public String toString(){
        return "[Board Id = "+this.id+", Board Name =  "+this.boardName+" , Board Size = "+this.size+"]";
    }

    public int hashcode(){   // equality contract
         return this.id;
    }

    @Override
    public  boolean equals(Object obj){

        BoardDTO dto = (BoardDTO) obj;    //DownCasting//this.hashcode() == dto1.hashcode()
        if(this instanceof BoardDTO){
           if(this.getBoardName().equals(dto.getBoardName()) && this.getId() == dto.getId() && this.getSize().equals(dto.getSize()) && this.hashcode() == dto.hashcode()  ){     //id are same , size are same
               return  true;
            }

        }else{
            System.out.println("given instance not Board type");
        }
        return  false;
    }
}
