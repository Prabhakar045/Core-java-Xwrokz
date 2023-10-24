package com.xworkz.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MallDTO {

    private int id;
    private String Name;
    private String Size;

    public String toString(){
         return "[Mall ID ="+this.id+", Mall Name = "+this.Name+", Mall size = "+this.Size+"]";
    }
}
