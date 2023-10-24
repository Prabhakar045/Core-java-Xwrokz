package com.xworkz.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StudentDTO {

    private int studentId;
    private String studentName;
    private int age;

    @Override
    public String toString(){
        return "[Student ID = "+this.studentId+", Student Name = "+this.studentName+", Age = "+this.age+"]";
    }
}
