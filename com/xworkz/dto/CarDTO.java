package com.xworkz.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CarDTO {

    private String brand;
    private String model;
    private int year;

    @Override
    public String toString(){
        return "[Brand = "+this.brand+", Model = "+this.model+", Year = "+this.year+"]";
    }
}
